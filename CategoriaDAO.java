package dao;

import conexion.ConexionBiblioteca;
import modelo.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDAO {

   
    public boolean insertar(Categoria categoria) {
        String sql = "INSERT INTO categorias (nombre) VALUES (?)";

        try (Connection con = ConexionBiblioteca.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, categoria.getNombre());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al insertar categoria: " + e.getMessage());
            return false;
        }
    }

    public List<Categoria> listar() {
        List<Categoria> lista = new ArrayList<>();
        String sql = "SELECT id, nombre FROM categorias";

        try (Connection con = ConexionBiblioteca.getConexion();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Categoria categoria = new Categoria(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    ""
                );

                lista.add(categoria);
            }

        } catch (SQLException e) {
            System.out.println("Error al listar categorias: " + e.getMessage());
        }

        return lista;
    }
}
