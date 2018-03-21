package com.kodilla.exception.test;

public class Engine {
    public static void main(String[] args) {
        Flight flight = new Flight("Lisbon", "London");
        FlightSearchLogic flightSearchLogic = new FlightSearchLogic();

        try {
            flightSearchLogic.findFlight(flight);
        }
        catch (RouteNotFoundException e) {
            System.out.println("Exception: " + e + "\nProvide new entry data.");
        }
    }
}
