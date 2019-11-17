package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        if (Calculator.add(7, 3) == 10) {
            System.out.println("Add test OK");
        } else {
            System.out.println("Add test Error");
        }

        if (Calculator.sub(15, 35) == 20) {
            System.out.println("Sub test OK");
        } else {
            System.out.println("Sub test Error");
        }
    }
}