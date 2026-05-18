package ca.senecacollege.models;

import ca.senecacollege.abstracts.Vehicle;

public abstract class passengerVehicles extends Vehicle {

    public passengerVehicles(String name, double purchasePrice, int currentMileage){
        super(name, purchasePrice, currentMileage);
        super.primaryFunction = "Passenger Vehicles";

    }

    @Override
    public String getCategory() {
        return super.primaryFunction;
    }

    //I have no idea how to implement this function
    @Override
    public int compareTo(Vehicle other) {
        return 0;
    }
}
