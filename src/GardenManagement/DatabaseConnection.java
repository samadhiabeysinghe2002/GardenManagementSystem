/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginandsignup;

/**
 *
 * @author Hi
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/gardendb?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    // Register the MySQL JDBC driver
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
        }
    }

    // Create a method to establish a database connection
    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } 
        catch (SQLException ex) {
            // Handle any potential errors here
            throw ex;
        }
        return connection;
    }
}

