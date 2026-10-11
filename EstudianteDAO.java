package dao;

import conexion.ConexionBiblioteca;
import modelo.Estudiante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO {

    public boolean insertar(Estudiante estudiante) {
        String sql = "INSERT INTO estudiantes "
                + "(rut, nombre, apellido, curso) VALUES (?, ?, ?, ?)";

        try (Connection con = ConexionBiblioteca.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, estudiante.getRut());
            ps.setString(2, estudiante.getNombre());
            ps.setString(3, estudiante.getApellido());
            ps.setString(4, estudiante.getCurso());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al insertar estudiante: " + e.getMessage());
            return false;
        }
    }

    public List<Estudiante> listar() {
        List<Estudiante> lista = new ArrayList<>();
        String sql = "SELECT * FROM estudiantes";

        try (Connection con = ConexionBiblioteca.getConexion();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Estudiante estudiante = new Estudiante(
                    rs.getInt("id"),
                    rs.getString("rut"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getString("curso")
                );

                lista.add(estudiante);
            }

        } catch (SQLException e) {
            System.out.println("Error al listar estudiantes: " + e.getMessage());
        }

        return lista;
    }

    public boolean eliminar(int id) {
        String sql = "DELETE FROM estudiantes WHERE id = ?";

        try (Connection con = ConexionBiblioteca.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al eliminar estudiante: " + e.getMessage());
            return false;
        }
    }
}

