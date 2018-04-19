package com.kodilla.good.patterns.challenges.flights;

import java.util.Set;

public class Application {
    public static void main(String[] args) {
        FlightSearchLogic flightSearchLogic = new FlightSearchLogic();

        Set<Flight> resultSetFlightsFrom = flightSearchLogic.searchFlightsFrom("Poznan");
        if (resultSetFlightsFrom.size() != 0) {
            System.out.println("\nFlights from chosen location:");
            for (Flight connection : resultSetFlightsFrom) {
                System.out.println(connection);
            }
        } else {
            System.out.println("We don't offer flights from this city\n");
        }

        Set<Flight> resultSetFlightsTo = flightSearchLogic.searchFlightsTo("Warsaw");
        if (resultSetFlightsTo.size() != 0) {
            System.out.println("\nFlights to chosen location:");
            for (Flight connection : resultSetFlightsTo) {
                System.out.println(connection);
            }
        } else {
            System.out.println("We don't offer flights to this city\n");
        }

        Set<Flight> resultSetFlightsThrough = flightSearchLogic.searchFlightsThrough
                ("Warsaw", "Lublin", "Lodz");
        if (resultSetFlightsThrough.size() != 0) {
            System.out.println("\nConnections through selected airport:");
            for (Flight connection : resultSetFlightsThrough) {
                System.out.println(connection);
            }
        } else {
            System.out.println("We don't offer such connection\n");
        }
    }
}
