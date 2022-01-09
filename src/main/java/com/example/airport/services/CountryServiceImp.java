package com.example.airport.services;

import com.example.airport.domains.Country;
import com.example.airport.repositories.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImp implements CountryService{
    private final CountryRepository countryRepository;

    public CountryServiceImp(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public List<Country> findAll() {
        return countryRepository.findAll();
    }

    @Override
    public Country findById(long id) {
        return countryRepository.findById(id);
    }
}
