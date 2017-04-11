package com.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Useful links:
 *   https://www.mkyong.com/jdbc/how-do-connect-to-postgresql-with-jdbc-driver-java/
 */
public class ConnectionFactory {

    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USERNAME = "tjkemper";
    private static final String PASSWORD = "";

    public static Connection createConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
