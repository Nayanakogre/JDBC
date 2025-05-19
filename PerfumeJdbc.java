package com.xworkz.perfume;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PerfumeJdbc {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/nayana";
        String username = "root";
        String password = "Nayana@07";
        String driver = "com.mysql.cj.jdbc.Driver";

        try {
            Class.forName(driver);
            System.out.println("Driver loaded successfully!!");

            String insertQuery = "INSERT INTO perfume(id, brand, price) VALUES (8, 'fogg', 450)";
            String updateQuery="UPDATE perfume SET price=600 WHERE ID=2";
            String deleteQuery="DELETE FROM perfume WHERE ID IN(1,2,3)";


            try (Connection connection = DriverManager.getConnection(url, username, password);
                 Statement statement = connection.createStatement()) {

                statement.execute(insertQuery);
                System.out.println("Inserted successfully!!");
                statement.execute(updateQuery);
                System.out.println("Updated Succesfully!!");
                statement.execute(deleteQuery);
                System.out.println("Deleted succefully");


            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
