package com.xworkz.flight.repository;

import com.xworkz.flight.dto.FlightDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FlightRepositoryImpl implements FlightRepository{
    @Override
    public void persist(FlightDto flightDto) {
        String url = "jdbc:mysql://localhost:3306/plants";
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
        PreparedStatement p_statement=null;

        String insert="INSERT INTO flight(id,company,source,destination) values (?,?,?,?)";
        try {
            connection= DriverManager.getConnection(url,username,password);
            p_statement=connection.prepareStatement(insert);
            p_statement.setInt(1,flightDto.getId());
            p_statement.setString(2,flightDto.getCompany());
            p_statement.setString(3,flightDto.getSource());
            p_statement.setString(4,flightDto.getDestination());
            p_statement.execute();
            System.out.println("inserted successfully!!!");
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
            if(p_statement!=null)
            {
                try {
                    p_statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
