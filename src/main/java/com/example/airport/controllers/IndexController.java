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
//    private final RunawayService runawayService;

    public IndexController(AirportService airportService, CountryService countryService) {
        this.airportService = airportService;
        this.countryService = countryService;
//        this.runawayService = runawayService;
    }

    @GetMapping
    public ModelAndView index(){
        var modelAndView=new ModelAndView("index");
        List<Country> countries = new ArrayList<>();
        for (Country country: countryService.findAll()) {
            countries.add(country);
        }
        modelAndView.addObject("countries",countries);
        return modelAndView;
    }
    @GetMapping("{countryId}")
    public ModelAndView index2(@PathVariable long countryId){
        var modelAndView = new ModelAndView("country");
        var country=countryService.findById(countryId);
        List<String> airportsAndRunaways = new ArrayList<>();
        String text = " ";
        for (var airport: country.getAirports()) {
//            System.out.println(airport.getIdent());
            text = airport.getIdent();
            for (var runwaway: airport.getRunways()) {
                text = text.concat(" ").concat(runwaway.getLe_ident()).concat(" ");
            }
            System.out.println(text);
            airportsAndRunaways.add(text);
        }

        modelAndView.addObject("airportsAndRunaways",airportsAndRunaways);
        return modelAndView;
    }
}
