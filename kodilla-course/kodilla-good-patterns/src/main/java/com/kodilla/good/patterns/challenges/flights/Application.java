package com.kodilla.good.patterns.challenges.flights;

import java.util.Iterator;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        FlightSearchLogic flightSearchLogic = new FlightSearchLogic();

        Set<Flight> resultSetFlightsFrom = flightSearchLogic.searchFlightsFrom("Poznan");
        if(resultSetFlightsFrom.size() != 0) {
            System.out.println("\nFlights from chosen location:");
            Iterator<Flight> it1 = resultSetFlightsFrom.iterator();
            while (it1.hasNext()) {
                System.out.println(it1.next());
            }
        } else {
            System.out.println("We don't offer flights from this city\n");
        }

        Set<Flight> resultSetFlightsTo = flightSearchLogic.searchFlightsTo("Warsaw");
        if(resultSetFlightsTo.size() != 0) {
            System.out.println("\nFlights to chosen location:");
            Iterator<Flight> it2 = resultSetFlightsTo.iterator();
            while (it2.hasNext()) {
                System.out.println(it2.next());
            }
        } else {
            System.out.println("We don't offer flights to this city\n");
        }

        Set<Flight> resultSetFlightsThrough = flightSearchLogic.searchFlightsThrough
                ("Warsaw", "Lublin", "Lodz");
        if(resultSetFlightsThrough.size() != 0) {
            System.out.println("\nConnections through selected airport:");
            Iterator<Flight> it3 = resultSetFlightsThrough.iterator();
            while (it3.hasNext()) {

                System.out.println(it3.next());
            }
        } else {
            System.out.println("We don't offer such connection\n");
        }
    }
}
