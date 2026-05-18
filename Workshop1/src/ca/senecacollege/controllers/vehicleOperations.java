package ca.senecacollege.controllers;

import ca.senecacollege.abstracts.Vehicle;


public class vehicleOperations {
    public vehicleOperations() {}
    public String getPrimaryFunction(Vehicle v){
        return v.primaryFunction;
    }

    public String getFuelType(Vehicle v){
        return v.fuelType;
    }
}
