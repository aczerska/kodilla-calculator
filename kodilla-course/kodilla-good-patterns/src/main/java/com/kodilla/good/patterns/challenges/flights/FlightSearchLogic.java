package com.kodilla.good.patterns.challenges.flights;


import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearchLogic {

    public Set<Flight> searchFlightsFrom(String searchDepartureAirport) {
        return FlightCollection.getFligtsCollection().stream()
                .filter(s -> s.getDepartureAirport().equals(searchDepartureAirport))
                .collect(Collectors.toSet());
    }

    public Set<Flight> searchFlightsTo(String searchArrivalAirport) {
        return FlightCollection.getFligtsCollection().stream()
                .filter(s -> s.getArrivalAirport().equals(searchArrivalAirport))
                .collect(Collectors.toSet());
    }

    public Set<Flight> searchFlightsThrough(String searchDepartureAirport,String searchTransferAirport,String searchArrivalAirport) {
        return FlightCollection.getFligtsCollection().stream()
                .filter(s -> s.getDepartureAirport().equals(searchDepartureAirport) ||
                        s.getArrivalAirport().equals(searchArrivalAirport))
                .filter(s -> s.getArrivalAirport().equals(searchTransferAirport) ||
                        s.getDepartureAirport().equals(searchTransferAirport))
                .collect(Collectors.toSet());
    }
}
