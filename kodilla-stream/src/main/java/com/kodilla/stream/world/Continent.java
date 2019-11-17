package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final List<Country> countriesList = new ArrayList<>();

    public List<Country> getCountryList(){
        return countriesList;
    }

    public void addCountryTolist(Country country){
        getCountryList().add(country);
    }
}
