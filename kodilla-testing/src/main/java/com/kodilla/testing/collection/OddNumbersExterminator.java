package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        Iterator<Integer> iteratorNumbers = numbers.iterator();
        while(iteratorNumbers.hasNext()){
            Integer number = iteratorNumbers.next();
            if (number % 2 == 0){
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }
}