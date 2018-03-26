package com.kodilla.exception.test;

public class Engine {
    public static void main(String[] args) {

        FlightSearchLogic flightSearchLogic = new FlightSearchLogic();

        try {
            flightSearchLogic.findFlight();
        }
        catch (RouteNotFoundException e) {
            System.out.println("Exception: " + e + "\nProvide new entry data.");
        }
    }
}
