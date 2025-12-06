package Modelo.DAO;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConexion {
   private static final String URL = "jdbc:postgresql://localhost:5432/boletos_db";
    private static final String USER = "postgres";
    private static final String PASSWORD = "admin";

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    } 
}
