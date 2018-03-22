package com.kodilla.exception.test;

import java.util.*;

public class FlightSearchLogic {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Amsterdam", true);
        flightMap.put("Warsaw", true);
        flightMap.put("London", false);
        flightMap.put("Madrid", false);

        if (flightMap.containsKey(flight.getArrivalAirport()) && flightMap.get(flight.getArrivalAirport())
                && flightMap.containsKey(flight.getDepartureAirport()) && flightMap.get(flight.getDepartureAirport())) {
            System.out.println("Chosen route is available, you can proceed with reservation procedures");
        } else {
            throw new RouteNotFoundException("Arrival and/or departure airport do not exist in data base.");
        }
    }
}
