package com.xworkz.grocery;

import java.sql.*;

public class GroceryJdbc {
    public static void main(String[] args) throws SQLException {
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
        PreparedStatement statement;

        String insertQuery="INSERT INTO grocery" +
                "(id,created_by,created_at," +
                "item_name,brand,quantity,price)" +
                "value" +
                "(8,'daali',NOW(),'rice','knn','50','2500')";
        String updateQuery="UPDATE grocery SET price='3000' where id=8";
        String selectQuery="SELECT * FROM grocery";



                connection= DriverManager.getConnection(url,username,password);


            statement=connection.prepareStatement(selectQuery);
//            System.out.println("Connection is ready");
//
//            Statement statement=connection.createStatement();
//            statement.execute(insertQuery);
//            System.out.println("inserted succefully");
//            statement.execute(updateQuery);
//            System.out.println("Updataed  succesfully");
            ResultSet rs = statement.executeQuery(selectQuery);
             while (rs.next()) {

               System.out.println(rs.getString("price"));
               System.out.println(rs.getString(3));
        }
        }

    }

