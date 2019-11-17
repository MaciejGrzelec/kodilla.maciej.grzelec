package com.kodilla.exception.test83;

public class Fligth {
    private String deprtureAirport;
    private String arrivalAirport;

    public Fligth(String deprtureAirport, String arrivalAirport) {
        this.deprtureAirport = deprtureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDeprtureAirport() {
        return deprtureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fligth fligth = (Fligth) o;

        if (deprtureAirport != null ? !deprtureAirport.equals(fligth.deprtureAirport) : fligth.deprtureAirport != null)
            return false;
        return arrivalAirport != null ? arrivalAirport.equals(fligth.arrivalAirport) : fligth.arrivalAirport == null;
    }

    @Override
    public int hashCode() {
        int result = deprtureAirport != null ? deprtureAirport.hashCode() : 0;
        result = 31 * result + (arrivalAirport != null ? arrivalAirport.hashCode() : 0);
        return result;
    }
}
