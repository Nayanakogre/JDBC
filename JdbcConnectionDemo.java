package com.xworkz.jdbcex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnectionDemo {
    public static void main(String[] args)  {
        //main protocol:sub protocol//host:port number/database
        String url="jdbc:mysql://localhost:3306/nayana";
        String username="root";
        String password="Nayana@07";
        String driver="com.mysql.cj.jdbc.Driver";//com.oracle.jdbc.OracleDriver

        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Connection setup");
        //insert
        String query="INSERT into factory(id,factory_name,products) value (11,'vkc','footware')";
        String updateQuery="UPDATE factory SET factory_name='vkc' WHERE id=10";
        String deleteQuery="DELETE FROM factory WHERE id=1";

        try {
            Connection connection= DriverManager.getConnection(url,username,password);
            System.out.println("Connection is ready");

            Statement statement=connection.createStatement();
//            statement.execute(query);
//            System.out.println("Query executed");
            statement.execute(updateQuery);
            System.out.println("Udated succesfully");
            statement.execute(deleteQuery);
            System.out.println("Deleted succefully");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
