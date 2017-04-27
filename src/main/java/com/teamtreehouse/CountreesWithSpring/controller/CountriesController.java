package com.teamtreehouse.CountreesWithSpring.controller;

import com.teamtreehouse.CountreesWithSpring.data.CountryRepository;
import com.teamtreehouse.CountreesWithSpring.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by scott on 4/26/2017.
 */
@Controller
public class CountriesController {
    @Autowired
    private CountryRepository repository;


    @RequestMapping("/")
    public String index(ModelMap modelMap){
        List<Country> countries = repository.findAllCountries();
        modelMap.put("countries", countries);
        return "index";
    }

    @RequestMapping("/nameSort")
    public String nameSortedIndex(ModelMap modelMap){
        List<Country> countries = repository.findAllCountriesSortedByName();
        modelMap.put("countries",countries);
        return "index";
    }

    @RequestMapping("/popSort")
    public String popSortedIndex(ModelMap modelMap){
        List<Country> countries = repository.findAllCountriesSortedByPopulation();
        modelMap.put("countries",countries);
        return "index";
    }

    @RequestMapping("/country/{Country}")
    public String Country(@PathVariable String Country, ModelMap modelMap){
        Country country = repository.findCountryByName(Country);
        modelMap.put("country", country);
        return "detail";

    }


}
