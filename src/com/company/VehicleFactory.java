package com.company;

public class VehicleFactory {
    private VehicleFactory() {
        //Prevent instantiation
    }

    public static Vehicle buildVehicle(String model)
    {
        Vehicle vehicle = null;
        String company = "Mercedes";
        switch(company)
        {
            case "Mercedes":
                vehicle = MercedesFactory.buildVehicle(model);
                break;
            case "Honda":
                vehicle = HondaFactory.buildVehicle(model);
                break;

            case "Kia":
                vehicle = KiaFactory.buildVehicle(model);
                break;
            default:
                vehicle = MercedesFactory.buildVehicle(model);
        }
        return vehicle;
    }
}
