package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        // Given
        World world = new World();

        Continent asia = new Continent();
        Continent europe = new Continent();
        Continent africa = new Continent();

        world.addContinent(asia);
        world.addContinent(africa);
        world.addContinent(europe);

        Country poland = new Country();
        Country spain = new Country();
        Country japan = new Country();
        Country korea = new Country();
        Country nigeria = new Country();
        Country kongo = new Country();

        asia.addCountry(japan);
        asia.addCountry(korea);
        europe.addCountry(poland);
        europe.addCountry(spain);
        africa.addCountry(nigeria);
        africa.addCountry(kongo);

        // When
        BigDecimal worldPopulation = world.getPeopleQuantity();

        // Then
        BigDecimal expectedWorldPopulation = new BigDecimal("863788254");
        Assert.assertEquals(expectedWorldPopulation, worldPopulation);
    }
}
