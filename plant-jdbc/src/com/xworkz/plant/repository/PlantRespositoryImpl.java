package com.xworkz.plant.repository;

import com.xworkz.plant.dto.PlantDto;

import java.sql.*;
import java.util.List;

public class PlantRespositoryImpl implements PlantRepository{
    @Override
    public void save(List<PlantDto> plantDto) {
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
        String insert="INSERT INTO plant(id,name,lifespan)values(?,?,?)";

        try {
            connection= DriverManager.getConnection(url,username,password);
            p_statement=connection.prepareStatement(insert);
            for( PlantDto pd:plantDto) {
                p_statement.setInt(1, pd.getId());
                p_statement.setString(2, pd.getName());
                p_statement.setInt(3, pd.getLifespan());
                p_statement.addBatch();
            }
            int[] count=p_statement.executeBatch();
            System.out.println("Inserted Succesfull"+count.length);
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

    @Override
    public void display(PlantDto plantDto) {
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
        String select="SELECT * FROM plant";
        try {
            connection=DriverManager.getConnection(url,username,password);
            p_statement=connection.prepareStatement(select);
            ResultSet rs=p_statement.executeQuery();
            while (rs.next())
            {
                int id=rs.getInt(1);
                String name=rs.getString(2);
                int span=rs.getInt(3);
                System.out.println("Id :"+id +" ,"+"Name :"+name +" ,"+"span :" +span);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
