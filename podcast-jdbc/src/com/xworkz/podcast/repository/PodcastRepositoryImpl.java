package com.xworkz.podcast.repository;

import com.xworkz.podcast.dto.PodcastDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PodcastRepositoryImpl implements PodcastRepository{


    @Override
    public void save(PodcastDto podcastDto) {
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

        String insert="INSERT INTO podcast(id,host,platform,topic) values (?,?,?,?)";
        try {
            connection= DriverManager.getConnection(url,username,password);
            p_statement=connection.prepareStatement(insert);
            p_statement.setInt(1,podcastDto.getId());
            p_statement.setString(2,podcastDto.getHost());
            p_statement.setString(3,podcastDto.getPlatform());
            p_statement.setString(4,podcastDto.getTopic());
            p_statement.execute();
            System.out.println("Inserted successfully!!!");
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
