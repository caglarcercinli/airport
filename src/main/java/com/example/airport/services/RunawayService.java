package com.example.airport.services;

import com.example.airport.domains.Airport;

import java.util.List;

public interface RunawayService {
    List<Airport> findByAirport_ref(long id);

}
