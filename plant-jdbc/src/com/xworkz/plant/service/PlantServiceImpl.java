package com.xworkz.plant.service;

import com.xworkz.plant.dto.PlantDto;
import com.xworkz.plant.repository.PlantRepository;
import com.xworkz.plant.repository.PlantRespositoryImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PlantServiceImpl implements PlantService{
    PlantRepository plantRepository=new PlantRespositoryImpl();

    @Override
    public void saveValidate(List<PlantDto> plantDto) {

            if(plantDto!=null)
            {
                System.out.println("proced");
                plantRepository.save(plantDto);

            }
            else {
                System.out.println("dto is null");
            }
    }

    @Override
    public void service(PlantDto plantDto) {
        if(plantDto!=null)
        {
            System.out.println("proces");
            plantRepository.display(plantDto);
        }
        else {
            System.out.println("dto is null");

        }
    }

}
