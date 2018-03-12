package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Continent {
    private final Country country;
    private final List<Country> countryList = new ArrayList<>();

    public Continent(final Country country) {
        this.country = country;
    }

    public void addCountry(Country country) {
        countryList.add(country);
    }

    public Country getCountry() {
        return country;
    }

    public List<Country> getCountryList() {
        return countryList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return Objects.equals(country, continent.country);
    }

    @Override
    public int hashCode() {

        return Objects.hash(country);
    }

    @Override
    public String toString() {
        return "Continent{" +
                "country=" + country +
                ", countryList=" + countryList +
                '}';
    }
}
