package com.xworkz.plant.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class PlantDto {
    private Integer id;
    private String name;
    private int lifespan;
}
