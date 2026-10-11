package dao;

import conexion.ConexionBiblioteca;
import modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    public Usuario autenticar(String nombreUsuario, String clave) {
        String sql = "SELECT * FROM usuarios WHERE usuario = ? AND clave = ?";

        try (Connection con = ConexionBiblioteca.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, nombreUsuario);
            ps.setString(2, clave);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Usuario(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("usuario"),
                        rs.getString("clave"),
                        rs.getString("rol")
                    );
                }
            }

        } catch (SQLException e) {
            System.out.println("Error al autenticar usuario: " + e.getMessage());
        }

        return null;
    }
}

