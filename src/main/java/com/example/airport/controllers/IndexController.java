package com.example.airport.controllers;

import com.example.airport.domains.Country;
import com.example.airport.services.AirportService;
import com.example.airport.services.CountryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class IndexController {
    private final AirportService airportService;
    private final CountryService countryService;

    public IndexController(AirportService airportService, CountryService countryService) {
        this.airportService = airportService;
        this.countryService = countryService;
    }

    @GetMapping
    public ModelAndView index(){
        var modelAndView=new ModelAndView("index");
//        List<Long> ids = new ArrayList<>();
        List<Country> countries = new ArrayList<>();

        for (Country country: countryService.findAll()) {
            countries.add(country);
            System.out.println(country.getId());
        }
//        modelAndView.addObject("ids",ids);
        modelAndView.addObject("countries",countries);
        return modelAndView;
    }
    @GetMapping("{countryId}")
    public ModelAndView index2(@PathVariable long countryId){
        var modelAndView = new ModelAndView("country","airportsandrunways",null);
//        var country=countryService.findById(302676);
//        for (var airport:country.getAirports()) {
//            System.out.println(airport.getIdent());
//        }
        modelAndView.addObject("airports",countryService.findById(countryId).getAirports());
        return modelAndView;
    }
}
