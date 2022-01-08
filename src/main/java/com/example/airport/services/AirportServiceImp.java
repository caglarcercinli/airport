package com.example.airport.services;

import com.example.airport.domains.Airport;
import com.example.airport.repositories.AirportRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportServiceImp implements AirportService {
    private final AirportRepository airportRepository;

    public AirportServiceImp(AirportRepository airportRepository) {
        this.airportRepository = airportRepository;
    }

    @Override
    public Airport findById(long id) {
        return airportRepository.findById(id);
    }

    @Override
    public List<Airport> findAll() {
        return airportRepository.findAll();
    }
}
