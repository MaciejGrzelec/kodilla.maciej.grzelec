package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    final BigDecimal countryPopulation;

    public Country(final BigDecimal countryPopulation) {
        this.countryPopulation = countryPopulation;
    }

    public BigDecimal getPeopleQuantity(){
        return countryPopulation;
    }
}
