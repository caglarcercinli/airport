package com.example.airport.services;

import com.example.airport.domains.Airport;
import com.example.airport.repositories.RunawayRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RunawayServiceImp implements RunawayService {
    private final RunawayRepository runawayRepository;

    public RunawayServiceImp(RunawayRepository runawayRepository) {
        this.runawayRepository = runawayRepository;
    }

    @Override
    public List<Airport> findByAirport_ref(long id) {
        return runawayRepository.findByAirport_ref(id);
    }
}
