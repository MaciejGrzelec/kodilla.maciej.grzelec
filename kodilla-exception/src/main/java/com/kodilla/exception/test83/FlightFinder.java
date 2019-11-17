package com.kodilla.exception.test83;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public static Boolean findFlight(Fligth fligth) throws RouteNotFoundException{
        Map<String, Boolean> airportMap = new HashMap<>();
        Boolean airportIsOpen = airportMap.get(fligth.getArrivalAirport());
        if (airportIsOpen != null)
            return airportIsOpen;
        else
            throw new RouteNotFoundException("No such airport <" + fligth.getArrivalAirport().toString() + "> in Collection!");
    }

    public static void main(String[] args) {
        Fligth fligth = new Fligth("Boston", "New York");
        try {
            findFlight(fligth);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
            System.out.println("Can't find flights to " + fligth.getArrivalAirport().toString());
        }
    }
}
