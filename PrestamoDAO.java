package dao;

import conexion.ConexionBiblioteca;
import modelo.Prestamo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PrestamoDAO {

    public boolean registrarPrestamo(int idLibro, int idEstudiante) {
        String sqlLibro =
                "UPDATE libros SET disponibles = disponibles - 1 "
                + "WHERE id = ? AND disponibles > 0";

        String sqlPrestamo =
                "INSERT INTO prestamos "
                + "(id_libro, id_estudiante, fecha_prestamo, estado) "
                + "VALUES (?, ?, CURDATE(), 'Activo')";

        Connection conexion = null;

        try {
            conexion = ConexionBiblioteca.getConexion();
            conexion.setAutoCommit(false);

            try (PreparedStatement sentencia =
                    conexion.prepareStatement(sqlLibro)) {

                sentencia.setInt(1, idLibro);

                if (sentencia.executeUpdate() == 0) {
                    conexion.rollback();
                    return false;
                }
            }

            try (PreparedStatement sentencia =
                    conexion.prepareStatement(sqlPrestamo)) {

                sentencia.setInt(1, idLibro);
                sentencia.setInt(2, idEstudiante);
                sentencia.executeUpdate();
            }

            conexion.commit();
            return true;

        } catch (SQLException e) {
            if (conexion != null) {
                try {
                    conexion.rollback();
                } catch (SQLException error) {
                    System.out.println(error.getMessage());
                }
            }

            System.out.println("Error al registrar prestamo: "
                    + e.getMessage());
            return false;

        } finally {
            if (conexion != null) {
                try {
                    conexion.setAutoCommit(true);
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public List<Prestamo> listarPrestamos() {
        List<Prestamo> listaPrestamos = new ArrayList<>();

        String sql = "SELECT * FROM prestamos";

        try (Connection conexion = ConexionBiblioteca.getConexion();
             PreparedStatement sentencia = conexion.prepareStatement(sql);
             ResultSet resultado = sentencia.executeQuery()) {

            while (resultado.next()) {
                Prestamo prestamo = new Prestamo(
                    resultado.getInt("id"),
                    resultado.getInt("id_libro"),
                    resultado.getInt("id_estudiante"),
                    resultado.getDate("fecha_prestamo"),
                    resultado.getDate("fecha_devolucion"),
                    resultado.getString("estado")
                );

                listaPrestamos.add(prestamo);
            }

        } catch (SQLException e) {
            System.out.println("Error al listar prestamos: "
                    + e.getMessage());
        }

        return listaPrestamos;
    }

    public boolean devolverLibro(int idPrestamo) {
        String sqlPrestamo =
                "UPDATE prestamos SET estado = 'Devuelto', "
                + "fecha_devolucion = CURDATE() "
                + "WHERE id = ? AND estado = 'Activo'";

        Connection conexion = null;

        try {
            conexion = ConexionBiblioteca.getConexion();
            conexion.setAutoCommit(false);

            int idLibro;

            try (PreparedStatement sentencia =
                    conexion.prepareStatement(
                        "SELECT id_libro FROM prestamos "
                        + "WHERE id = ? AND estado = 'Activo' FOR UPDATE")) {

                sentencia.setInt(1, idPrestamo);

                try (ResultSet resultado = sentencia.executeQuery()) {
                    if (!resultado.next()) {
                        conexion.rollback();
                        return false;
                    }

                    idLibro = resultado.getInt("id_libro");
                }
            }

            try (PreparedStatement sentencia =
                    conexion.prepareStatement(sqlPrestamo)) {

                sentencia.setInt(1, idPrestamo);

                if (sentencia.executeUpdate() == 0) {
                    conexion.rollback();
                    return false;
                }
            }

            try (PreparedStatement sentencia =
                    conexion.prepareStatement(
                        "UPDATE libros SET disponibles = disponibles + 1 "
                        + "WHERE id = ?")) {

                sentencia.setInt(1, idLibro);
                sentencia.executeUpdate();
            }

            conexion.commit();
            return true;

        } catch (SQLException e) {
            if (conexion != null) {
                try {
                    conexion.rollback();
                } catch (SQLException error) {
                    System.out.println(error.getMessage());
                }
            }

            System.out.println("Error al devolver libro: "
                    + e.getMessage());
            return false;

        } finally {
            if (conexion != null) {
                try {
                    conexion.setAutoCommit(true);
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}

