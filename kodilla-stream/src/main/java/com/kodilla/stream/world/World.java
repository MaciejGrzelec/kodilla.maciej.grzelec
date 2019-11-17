package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

private final List<Continent> continentsList = new ArrayList<>();

    public List<Continent> getContinentsList() {
        return continentsList;
    }

    public void addContinentsToList(Continent continent){
        getContinentsList().add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        return getContinentsList().stream()
                .flatMap(s->s.getCountryList().stream())
                .map(s->s.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current)-> sum = sum.add(current));

    }
}
