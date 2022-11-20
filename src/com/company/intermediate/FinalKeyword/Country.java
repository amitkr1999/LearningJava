package com.company.intermediate.FinalKeyword;

public class Country {
    /*Final is use for when we want a class method variable to always store same value
      Final class can not be extended*/
    private final String NAME;
    private int population;
    private String capital;

    public Country(String name, int population, String capital) {
        NAME = name;
        this.population = population;
        this.capital = capital;
    }

    public final void populationChange(int change){
        population += change;
    }
}
