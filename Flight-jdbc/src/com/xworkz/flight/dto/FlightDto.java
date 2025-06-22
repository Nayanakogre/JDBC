package com.xworkz.flight.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class FlightDto {
    private int id;
    private String company;
    private String source;
    private String destination;

}
