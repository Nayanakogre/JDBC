package com.xworkz.flight.runner;

import com.xworkz.flight.dto.FlightDto;
import com.xworkz.flight.service.FlightService;
import com.xworkz.flight.service.FlightServiceImpl;

public class FlightRunner {
    public static void main(String[] args) {
        FlightDto flightDto=new FlightDto(3,"vistara","delhi","singapore");
        FlightService flightService=new FlightServiceImpl();
        flightService.validate(flightDto);
    }
}
