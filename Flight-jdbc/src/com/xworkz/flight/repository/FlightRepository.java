package com.xworkz.flight.repository;

import com.xworkz.flight.dto.FlightDto;

public interface FlightRepository {
    public void persist(FlightDto flightDto);

}
