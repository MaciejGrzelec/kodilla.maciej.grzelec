package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;


public class WorldTestSuite {

    @Test
    public void testWorldPopulation() {

        //Given
        Continent Asia = new Continent();

        /*Asia.addCountryTolist(new Country(new BigDecimal("1")));
        Asia.addCountryTolist(new Country(new BigDecimal("2")));
        Europe.addCountryTolist(new Country(new BigDecimal("3")));
        Europe.addCountryTolist(new Country(new BigDecimal("4")));*/

        Country Japan = new Country(new BigDecimal(1));
        Country China = new Country(new BigDecimal( 2));
        Asia.addCountryTolist(Japan);
        Asia.addCountryTolist(China);

        Continent Europe = new Continent();
        Country Poland = new Country(new BigDecimal(3));
        Country Italy = new Country(new BigDecimal(4));
        Europe.addCountryTolist(Poland);
        Europe.addCountryTolist(Italy);

        Continent NorthAmerica = new Continent();
        Country USA = new Country(new BigDecimal(5));
        Country Canada = new Country(new BigDecimal(6));
        NorthAmerica.addCountryTolist(USA);
        NorthAmerica.addCountryTolist(Canada);

        //When
        World world = new World();
        world.addContinentsToList(Asia);
        world.addContinentsToList(Europe);
        world.addContinentsToList(NorthAmerica);
        BigDecimal totalPopulation = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPopulation = new BigDecimal("21");
        Assert.assertTrue(Asia.getCountryList().contains(Japan));
        Assert.assertEquals(expectedPopulation,totalPopulation);
    }
}
