package com.xworkz.plant.runner;

import com.xworkz.plant.dto.PlantDto;
import com.xworkz.plant.service.PlantService;
import com.xworkz.plant.service.PlantServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class PlantRunner {
    public static void main(String[] args) {

        PlantDto plantDto=new PlantDto(3,"brinjal",1);
        PlantDto plantDto1=new PlantDto(4,"tamoto",3);
        PlantDto plantDto2=new PlantDto(5,"cocumber",1);
        PlantDto plantDto3=new PlantDto(6,"banana",2);
        PlantDto plantDto4=new PlantDto(7,"jamun",150);
        PlantDto plantDto5=new PlantDto(8,"apple",25);
        PlantDto plantDto6=new PlantDto(9,"grape",2);
        PlantDto plantDto7=new PlantDto(10,"watermelon",3);
        PlantDto plantDto8=new PlantDto(11,"orange",20);
        PlantDto plantDto9=new PlantDto(12,"pomogranate",5);

        List<PlantDto> list=new ArrayList<PlantDto>();
        list.add(plantDto);
        list.add(plantDto1);
        list.add(plantDto2);
        list.add(plantDto3);
        list.add(plantDto4);
        list.add(plantDto5);
        list.add(plantDto6);
        list.add(plantDto7);
        list.add(plantDto8);
        list.add(plantDto9);

        PlantService plantService=new PlantServiceImpl();
        //plantService.saveValidate(list);
        plantService.service(plantDto);
    }
}
