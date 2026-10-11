package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBiblioteca {

    private static final String URL =
            "jdbc:mysql://localhost:3306/biblioteca_escolar?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";

    private static final String USUARIO = "root";
    private static final String CLAVE = "Magdalmaleiton.3";

    private static Connection conexion;

    private ConexionBiblioteca() {
    }

    public static Connection getConexion() throws SQLException {
        if (conexion == null || conexion.isClosed()) {
            conexion = DriverManager.getConnection(
                    URL, USUARIO, CLAVE
            );
        }
        return conexion;
    }
}
