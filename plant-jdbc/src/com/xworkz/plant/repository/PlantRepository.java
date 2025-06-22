package com.xworkz.plant.repository;

import com.xworkz.plant.dto.PlantDto;

import java.util.List;

public interface PlantRepository {
    public void save(List<PlantDto> plantDto);
    public void display(PlantDto plantDto);

}
