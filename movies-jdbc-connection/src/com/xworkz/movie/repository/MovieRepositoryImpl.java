package com.xworkz.movie.repository;

import com.xworkz.movie.dto.MovieDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MovieRepositoryImpl implements MovieRepository{
    @Override
    public void save(MovieDto movieDto) {
        String url = "jdbc:mysql://localhost:3306/movie";
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

        String insert="INSERT INTO movies(id,movie) values (?,?)";
        try {
            connection= DriverManager.getConnection(url,username,password);
            p_statement=connection.prepareStatement(insert);
            p_statement.setInt(1,movieDto.getId());
            p_statement.setString(2,movieDto.getMovie());
            //p_statement.setString(3,movieDto.getHero());
            System.out.println(p_statement);
            p_statement.execute();
            System.out.println("Inserted succesfully");
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
