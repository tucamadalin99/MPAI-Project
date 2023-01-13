package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(VehicleFactory.buildVehicle("Car"));
        System.out.println(VehicleFactory.buildVehicle("Motorcycle"));
        System.out.println(VehicleFactory.buildVehicle("Bus"));
    }
}
