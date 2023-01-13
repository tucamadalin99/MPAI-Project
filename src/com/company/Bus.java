package com.company;

public class Bus extends Vehicle{
    public Bus(String company, String model){
         super(company, model);
         construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building Bus");
    }
}
