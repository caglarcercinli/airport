package com.example.airport.repositories;

import com.example.airport.domains.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country,Long> {
    List<Country> findAll();
    Country findById(long id);
}
