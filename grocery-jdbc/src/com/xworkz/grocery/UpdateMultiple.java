package com.xworkz.grocery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateMultiple {
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
        System.out.println("Connection setup");
        Connection connection=null;
        PreparedStatement statement=null;
        PreparedStatement statement1=null;
        String update="UPDATE grocery VALUE SET item_name=? WHERE id=?";
        String delete="DELETE FROM grocery WHERE ID=?";

        try {
            connection= DriverManager.getConnection(url,username,password);
            statement=connection.prepareStatement(update);
            statement1=connection.prepareStatement(delete);
//            statement.setString(1,"Cooking Oil");
//            statement.setInt(2,4);
//            statement.executeUpdate();
//            statement.setString(1,"Jaggery");
//            statement.setInt(2,5);
//            statement.executeUpdate();
            statement.setString(1,"Chicken");
            statement.setInt(2,4);
            statement.executeUpdate();
            System.out.println("Updated succefully");

            statement1.setInt(1,8);
            statement1.execute();
            System.out.println("Deleted succesfully!!!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            if(connection!=null)
            {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(statement!=null)
            {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
