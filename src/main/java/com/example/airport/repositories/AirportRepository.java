package com.example.airport.repositories;

import com.example.airport.domains.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AirportRepository extends JpaRepository<Airport,Long> {
    Airport findById(long id);
    List<Airport> findAll();
}
