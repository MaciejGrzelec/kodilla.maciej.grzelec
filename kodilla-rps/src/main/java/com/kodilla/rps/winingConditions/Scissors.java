package com.kodilla.rps.winingConditions;

public class Scissors implements WiningConditions{
    String name = "Scissors";
    public boolean beatsPlayer(WiningConditions winingConditions){
        if (winingConditions.getName()!="Paper"){
            return false;}
        return true;
    }

    @Override
    public String getName() {
        return name;
    }
}
