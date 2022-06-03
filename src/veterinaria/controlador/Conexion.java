package veterinaria.controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private String url = "jdbc:mysql://localhost/veterinaria";
    private String usuario = "root";
    private String password = "";

    private Connection conexion;

    public Conexion() throws ClassNotFoundException {
        Class.forName("org.mariadb.jdbc.Driver");
    }

    public Connection getConexion() throws SQLException {
        if (conexion == null) {
            // Setup the connection with the DB
            conexion = DriverManager
                    .getConnection(url + "?useLegacyDatetimeCode=false&serverTimezone=UTC"
                            + "&user=" + usuario + "&password=" + password);
        }
        return conexion;
    }
}
