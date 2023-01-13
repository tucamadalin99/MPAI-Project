package com.company;

public class Car extends Vehicle {
    public Car(String company, String model) {
        super(company, model);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building Car");
    }
}
