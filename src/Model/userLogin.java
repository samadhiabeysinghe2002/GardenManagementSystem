/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author HP
 */
public class userLogin {
    public boolean validateLogin(String username, String password) {
        try (Connection connection = Dbconnection.getConnection()) {
            String sql = "SELECT * FROM admin WHERE emailid = ? AND password = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();

          return resultSet.next(); // If there's a match, resultSet will have at least one row
        } catch (SQLException e) {
            return false;
        }
    }
    
}
