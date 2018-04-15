package com.kodilla.good.patterns.challenges.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightCollection {
    private static final String WARSAW = "Warsaw";
    private static final String GDANSK = "Gdansk";
    private static final String POZNAN = "Poznan";
    private static final String WROCLAW = "Wroclaw";
    private static final String KRAKOW = "Krakow";
    private static final String LODZ = "Lodz";
    private static final String LUBLIN = "Lublin";
    private static final String KATOWICE = "Katowice";
    private static final String RZESZOW = "Rzeszow";

    public Set<Flight> getFligtsCollection() {
        Set<Flight> flightsCollection = new HashSet<>();
        flightsCollection.add(new Flight(WARSAW,GDANSK));
        flightsCollection.add(new Flight(WARSAW,POZNAN));
        flightsCollection.add(new Flight(WARSAW,WROCLAW));
        flightsCollection.add(new Flight(WARSAW,KATOWICE));
        flightsCollection.add(new Flight(WARSAW,KRAKOW));
        flightsCollection.add(new Flight(WARSAW,LUBLIN));
        flightsCollection.add(new Flight(WARSAW,RZESZOW));
        flightsCollection.add(new Flight(GDANSK,KRAKOW));
        flightsCollection.add(new Flight(GDANSK,WARSAW));
        flightsCollection.add(new Flight(GDANSK,WROCLAW));
        flightsCollection.add(new Flight(WROCLAW,WARSAW));
        flightsCollection.add(new Flight(WROCLAW,GDANSK));
        flightsCollection.add(new Flight(WROCLAW,LUBLIN));
        flightsCollection.add(new Flight(LUBLIN,WARSAW));
        flightsCollection.add(new Flight(LUBLIN,LODZ));
        flightsCollection.add(new Flight(LODZ,WROCLAW));
        flightsCollection.add(new Flight(LODZ,KATOWICE));

        return flightsCollection;
    }

}
