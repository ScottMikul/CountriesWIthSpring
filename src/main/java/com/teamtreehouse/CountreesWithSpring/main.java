package com.teamtreehouse.CountreesWithSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by scott on 4/26/2017.
 */
@EnableAutoConfiguration
@ComponentScan
public class main {
    // TODO: 4/26/2017  Create index view want small icons next to each country listed, a clickable link to detail page
    // TODO: 4/26/2017  Add two ways of sorting the countries on the index page, for example by country name and by population.
    // TODO: 4/26/2017 Pick a country with at least two official languages. On its detail page, render the languages as either an ordered or unordered list.
    // TODO: 4/26/2017  Style the pages with different fonts and different sizing on index page
    public static void main(String[] args) {
        SpringApplication.run(main.class,args);
    }


}
