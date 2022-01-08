package com.example.airport.services;

import com.example.airport.domains.Country;

import java.util.List;

public interface CountryService {
    List<Country> findAll();
}
