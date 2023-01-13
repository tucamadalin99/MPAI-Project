package com.company;

public class HondaFactory {

    public static Vehicle buildVehicle(String model) {
        Vehicle vehicle = null;
        switch (model){
            case "Car":
                vehicle = new Car("Honda", "Car");
                break;
            case "Motorcycle":
                vehicle = new Motorcycle("Honda", "Motorcycle");
                break;
            case "Bus":
                vehicle = new Bus("Honda", "Bus");
                break;

            default:
                break;
        }

        return vehicle;
    }
}
