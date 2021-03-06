package com.kodilla.exception.test;

import java.util.*;

public class FlightSearchLogic {

    Map<String, Boolean> flightMap = new HashMap<>();
    Flight flight = new Flight("London", "Warsaw");

    public Map<String, Boolean> populateMap(Map<String, Boolean> map) {
        flightMap.put("Amsterdam", true);
        flightMap.put("Warsaw", true);
        flightMap.put("London", false);
        flightMap.put("Madrid", false);
        return flightMap;
    }

    public boolean checkAirport(Flight flight) {
        populateMap(flightMap);
        return (flightMap.containsKey(flight.getArrivalAirport()) &&
                flightMap.get(flight.getArrivalAirport()) &&
                flightMap.containsKey(flight.getDepartureAirport()) &&
                flightMap.get(flight.getDepartureAirport()));
    }

    public void findFlight() throws RouteNotFoundException {

        if (checkAirport(flight)) {
            System.out.println("Chosen route is available, you can proceed with reservation procedures");
        } else {
            throw new RouteNotFoundException("Arrival and/or departure airport do not exist in data base.");
        }
    }
}
