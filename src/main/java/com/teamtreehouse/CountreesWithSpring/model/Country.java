package com.teamtreehouse.CountreesWithSpring.model;

import java.util.List;

/**
 * Created by scott on 4/26/2017.
 */
public class Country {
    private String capital;
    private String name;
    private int population;
    private String[] languages;
    private String flagUrl;

    public Country(String capital, String name, int population, String [] languages, String flagUrl) {
        this.capital = capital;
        this.name = name;
        this.population = population;
        this.languages = languages;
        this.flagUrl = flagUrl;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String [] languages) {
        this.languages = languages;
    }

    public String getFlagUrl() {
        return flagUrl;
    }

    public void setFlagUrl(String flagUrl) {
        this.flagUrl = flagUrl;
    }
}
