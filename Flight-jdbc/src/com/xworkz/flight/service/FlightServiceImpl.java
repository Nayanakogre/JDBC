package com.xworkz.flight.service;

import com.xworkz.flight.dto.FlightDto;
import com.xworkz.flight.repository.FlightRepository;
import com.xworkz.flight.repository.FlightRepositoryImpl;

public class FlightServiceImpl implements FlightService{
    FlightRepository flightRepository=new FlightRepositoryImpl();

    @Override
    public void validate(FlightDto flightDto) {
        if(flightDto!=null)
        {
            System.out.println("procced");
            flightRepository.persist(flightDto);
        }
        else {
            System.out.println("dto is null");
        }
    }
}
