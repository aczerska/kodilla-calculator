package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class World {
    private final Continent continent;
    private final List<Continent> continentList = new ArrayList<>();

    public World(final Continent continent) {
        this.continent = continent;
    }

    public void addContinent(Continent continent) {
        continentList.add(continent);
    }

    public Continent getContinent() {
        return continent;
    }

    public List<Continent> getContinentList() {
        return continentList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        World world = (World) o;
        return Objects.equals(continent, world.continent);
    }

    @Override
    public int hashCode() {

        return Objects.hash(continent);
    }

    @Override
    public String toString() {
        return "World{" +
                "continent=" + continent +
                ", continentList=" + continentList +
                '}';
    }
    public BigDecimal getPeopleQuantity() {
        return continentList.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
