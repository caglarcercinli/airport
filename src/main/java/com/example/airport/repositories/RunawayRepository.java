package com.example.airport.repositories;

import com.example.airport.domains.Airport;
import com.example.airport.domains.Runaway;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RunawayRepository extends JpaRepository<Runaway,Long> {
    @Query(value = "select r from Runaway r where r.airport_ref=?1")
    List<Airport> findByAirport_ref(long id);
}
