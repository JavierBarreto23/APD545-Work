package ca.senecacollege.models;

import ca.senecacollege.abstracts.Vehicle;

public class commercialVehicles extends Vehicle {
    public commercialVehicles(String name, double purchasePrice, int currentMileage){
        super(name,purchasePrice,currentMileage);
        super.primaryFunction = "Commercial Vehicles";
        super.fuelType = "Diesel";
    }

    @Override
    public String getCategory() {
        return super.primaryFunction;
    }

    //I have no idea how to implement this function
    @Override
    public int compareTo(Vehicle other){
        return 0;
    }

}
