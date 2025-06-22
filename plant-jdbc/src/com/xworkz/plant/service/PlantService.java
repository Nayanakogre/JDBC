package com.xworkz.plant.service;

import com.xworkz.plant.dto.PlantDto;

import java.util.List;

public interface PlantService {
    public void saveValidate(List<PlantDto> plantDto);
    public void service(PlantDto plantDto);
}
