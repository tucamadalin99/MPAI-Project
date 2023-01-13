package com.company;

public abstract class Vehicle {

    private String company;
    private String model;

    public Vehicle(String company, String model){
        this.company = company;
        this.model = model;
    }

    protected abstract void construct();

    @Override
    public String toString() {
        return "Vehicle{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
