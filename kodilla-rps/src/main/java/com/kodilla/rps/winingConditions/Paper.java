package com.kodilla.rps.winingConditions;

public class Paper implements WiningConditions{
    String name = "Paper";


    public boolean beatsPlayer(WiningConditions winingConditions){
        if (winingConditions.getName()!="Rock"){
            return false;}
        return true;
    }

    @Override
    public String getName() {
        return name;
    }
}
