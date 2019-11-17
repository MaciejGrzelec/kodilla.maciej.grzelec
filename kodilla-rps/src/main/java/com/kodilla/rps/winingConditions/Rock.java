package com.kodilla.rps.winingConditions;

public class Rock implements WiningConditions{
    String name = "Rock";

    public boolean beatsPlayer(WiningConditions winingConditions){
        if (winingConditions.getName()!="Scissors"){
            return false;}
        return true;
    }

    @Override
    public String getName() {
        return name;
    }
}
