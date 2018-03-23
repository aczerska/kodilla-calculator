package com.kodilla.exception.test;

import java.util.*;

public class FlightSearchLogic {

    Map<String, Boolean> flightMap = new HashMap<>();

    public Map<String, Boolean> populateMap(Map<String,Boolean> map) {
        flightMap.put("Amsterdam", true);
        flightMap.put("Warsaw", true);
        flightMap.put("London", false);
        flightMap.put("Madrid", false);
        return flightMap;
    }

    public boolean checkAirport(Map<String,Boolean> map, Flight flight) {
        boolean operate;
        if (flightMap.containsKey(flight.getArrivalAirport()) &&
                flightMap.get(flight.getArrivalAirport()) &&
                flightMap.containsKey(flight.getDepartureAirport()) &&
                flightMap.get(flight.getDepartureAirport())) {
            operate = true;
        } else {
            operate = false;
        }
        return operate;
    }

    public void findFlight(boolean operate) throws RouteNotFoundException {

        if (operate) {
            System.out.println("Chosen route is available, you can proceed with reservation procedures");
        } else {
            throw new RouteNotFoundException("Arrival and/or departure airport do not exist in data base.");
        }
    }
}
