package com.company;

public class KiaFactory {
    public static Vehicle buildVehicle(String model) {
        Vehicle vehicle = null;
        switch (model){
            case "Car":
                vehicle = new Car("Kia", "Car");
                break;
            case "Motorcycle":
                vehicle = new Motorcycle("Kia", "Motorcycle");
                break;
            case "Bus":
                vehicle = new Bus("Kia", "Bus");
                break;

            default:
                break;
        }

        return vehicle;
    }
}
