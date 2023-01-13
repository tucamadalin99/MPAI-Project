package com.company;

public class Motorcycle extends Vehicle{
    public Motorcycle(String company, String model) {
        super(company, model);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building Motorcylce");
    }
}
