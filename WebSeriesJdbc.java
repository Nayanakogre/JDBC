package com.xworkz.webseries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class WebSeriesJdbc {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/nayana";
        String username="root";
        String password="Nayana@07";
        String driver="com.mysql.cj.jdbc.Driver";

        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Connection setup");

        String insertQuery = "INSERT INTO web_series (id, created_by, created_at, web_series_name, genere, language, season, `lead`, rating) " +
                "VALUES ('10', 'YouTube', NOW(), 'Ayyana Mane', 'Drama, Thriller', 'Kannada', '1', 'Various', '7.0')";
        String deleteQuery="DELETE FROM  web_series WHERE id IN (3,4,5,6,7)";
        try {
            Connection connection= DriverManager.getConnection(url,username,password);
            System.out.println("Connection is ready");

            Statement statement=connection.createStatement();
//            statement.execute(insertQuery);
//            System.out.println("Query executed");
            statement.execute(deleteQuery);
            System.out.println("Deleted succesfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
