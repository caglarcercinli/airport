package com.example.airport.services;

import com.example.airport.domains.Airport;

import java.util.List;

public interface AirportService {
    Airport findById(long id);
    List<Airport> findAll();
}
