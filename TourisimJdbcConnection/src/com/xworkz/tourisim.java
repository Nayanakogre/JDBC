package com.xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class tourisim {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/nayana";
        String username = "root";
        String password = "Nayana@07";
        String driver = "com.mysql.cj.jdbc.Driver";

        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Connnection setup succesfully!!");

        String insertQuery = "INSERT INTO tourisim(id,place,location,popular_for,duration) value(10,'Anegudde','udupi','Temple',1)";
        String updateQuery="UPDATE tourisim SET duration=2 WHERE id=1";

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection is ready!!!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            Statement statement = connection.createStatement();
//            statement.execute(insertQuery);
//            System.out.println("Inserted Succesfully");
            statement.execute(updateQuery);
            System.out.println("Updated succefully!!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
