package dao;

import conexion.ConexionBiblioteca;
import modelo.Libro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LibroDAO {

    public boolean insertar(Libro libro) {
        String sql = "INSERT INTO libros "
        + "(titulo, autor, isbn, editorial, stock, id_categoria) "
        + "VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection con = ConexionBiblioteca.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, libro.getTitulo());
            ps.setString(2, libro.getAutor());
            ps.setString(3, libro.getIsbn());
            ps.setString(4, "General");
            ps.setInt(5, libro.getCantidad());
            ps.setInt(6, libro.getIdCategoria());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
    javax.swing.JOptionPane.showMessageDialog(
            null,
            "Error al insertar libro: " + e.getMessage()
    );
    e.printStackTrace();
    return false;
}
    }

    
public List<Libro> listar() {
    List<Libro> lista = new ArrayList<>();
    String sql = "SELECT * FROM libros";

    try (Connection con = ConexionBiblioteca.getConexion();
         PreparedStatement ps = con.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {
            int stock = rs.getInt("stock");

            Libro libro = new Libro(
                rs.getInt("id"),
                rs.getString("titulo"),
                rs.getString("autor"),
                rs.getString("isbn"),
                rs.getInt("id_categoria"),
                stock,
                stock
            );

            lista.add(libro);
        }

    } catch (SQLException e) {
        System.out.println("Error al listar libros: " + e.getMessage());
    }

    return lista;

    }

    public boolean eliminar(int id) {
        String sql = "DELETE FROM libros WHERE id = ?";

        try (Connection con = ConexionBiblioteca.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            return ps.executeUpdate() > 0;

              } catch (SQLException e) {
            System.out.println("Error al eliminar libro: " + e.getMessage());
            return false;
        }
    }
}
