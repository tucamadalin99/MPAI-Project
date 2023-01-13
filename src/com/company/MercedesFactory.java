package com.company;

public class MercedesFactory {

    public static Vehicle buildVehicle(String model) {
        Vehicle vehicle = null;
        switch (model){
            case "Car":
                vehicle = new Car("Mercedes", "Car");
                break;
            case "Motorcycle":
                vehicle = new Motorcycle("Mercedes", "Motorcycle");
                break;
            case "Bus":
                vehicle = new Bus("Mercedes", "Bus");
                break;

            default:
                break;
        }

        return vehicle;
    }
}
