package com.teamtreehouse.CountreesWithSpring.data;

import com.teamtreehouse.CountreesWithSpring.model.Country;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by scott on 4/26/2017.
 */
@Component
public class CountryRepository {
    //capital, name, population, languages, flag
    public static List<Country> ALL_COUNTRIES = Arrays.asList(
            new Country("Paris","France",66991000, new String[]{"French"},"/flags/france.png"),
            new Country("New Delhi","India",1310069000,new String[]{"Hindi","English"},"/flags/india.png"),
            new Country("Rome","Italy",60674003,new String[]{"Italian"},"/flags/italy.png"),
            new Country("Quito","Ecuador",16144000, new String[]{"Spanish","Kichwa","Shuar"},"/flags/ecuador.png"),
            new Country("Nairobi","Kenya",46661552, new String[]{"English","Kiswahili"},"/flags/kenya.png")
    );

    public static Country findCountryByName(String name){
        return ALL_COUNTRIES.stream()
                .filter(country->country.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public List<Country> findAllCountries() {
        return ALL_COUNTRIES;
    }
    public List<Country> findAllCountriesSortedByName(){
        ArrayList<Country> list = new ArrayList<>(ALL_COUNTRIES);
        list.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        return list;
    }

    public List<Country> findAllCountriesSortedByPopulation(){
        ArrayList<Country> list = new ArrayList<>(ALL_COUNTRIES);
        list.sort((o1, o2) -> Integer.compare(o1.getPopulation(),o2.getPopulation()));
        return list;
    }
}
