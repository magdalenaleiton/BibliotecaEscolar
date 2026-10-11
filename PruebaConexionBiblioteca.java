package bibliotecaescolar;

import conexion.ConexionBiblioteca;
import java.sql.Connection;
import java.sql.SQLException;

public class PruebaConexionBiblioteca {

    public static void main(String[] args) {
        try (Connection con = ConexionBiblioteca.getConexion()) {
            System.out.println("CONEXION A BIBLIOTECA EXITOSA");
        } catch (SQLException e) {
            System.out.println("ERROR DE CONEXION");
            e.printStackTrace();
        }
    }
}

