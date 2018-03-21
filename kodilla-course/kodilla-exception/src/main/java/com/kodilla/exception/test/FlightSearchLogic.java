package com.kodilla.exception.test;

import java.util.*;

public class FlightSearchLogic {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Amsterdam", true);
        flightMap.put("Warsaw", true);
        flightMap.put("London", false);
        flightMap.put("Madrid", false);

        if ((flightMap.containsKey(flight.getArrivalAirport()) == true &&
                flightMap.get(flight.getArrivalAirport()) == true &&
                flightMap.containsKey(flight.getDepartureAirport()) == true &&
                flightMap.get(flight.getDepartureAirport()) == true)) {
            System.out.println("Chosen route is available, you can proceed with reservation procedures");
        } else if (flightMap.containsKey(flight.getArrivalAirport()) == false || flightMap.containsKey(flight.getDepartureAirport()) == false) {
            throw new RouteNotFoundException("Arrival and/or departure airport do not exist in data base.");
        } else if (flightMap.containsKey(flight.getArrivalAirport()) == true &&
                flightMap.get(flight.getArrivalAirport()) == false ||
                flightMap.containsKey(flight.getDepartureAirport()) == true &&
                        flightMap.get(flight.getDepartureAirport()) == false) {
            System.out.println("This route is not available. Please select other airports.");
        }
    }
}
