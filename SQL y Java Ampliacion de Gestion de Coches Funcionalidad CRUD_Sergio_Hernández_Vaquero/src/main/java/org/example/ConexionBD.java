package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static final String URL =
            "jdbc:mysql://localhost:3306/concesionario";

    private static final String USER = "root";
    private static final String CONTRASENIA = "";

    public static Connection obtenerConexion() throws SQLException {
        return DriverManager.getConnection(URL, USER, CONTRASENIA);
    }
}
