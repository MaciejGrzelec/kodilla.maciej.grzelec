package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String [][] workers = {
            {"123456781", "john1", "Smith1"},
            {"123456782", "john2", "Smith2"},
            {"123456783", "john3", "Smith3"},
            {"123456784", "john4", "Smith4"},
            {"123456785", "john5", "Smith5"}};
    private double [] salaries = {
            4500,
            3700,
            4350,
            9000,
            6200};
    public String getWorker(int n) {
        if (n > salaries.length) {
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " +workers[n][2] + ", " + salaries[n];
    }
    public String[][] getWorkers(){
        return workers;
    }
    public double[] getSalaries() {
        return salaries;
    }
}
