package ca.senecacollege.models;

import ca.senecacollege.abstracts.passengerVehicles;

public class Sedan extends passengerVehicles {
    public Sedan(String name, double purchasePrice, int currentMileage){
        super(name, purchasePrice, currentMileage);
        super.primaryFunction = "Executive transportation, client visits";
        super.serviceInterval = 10000;
        super.maintenanceCost = 350.00;
        super.fuelType = "Gasoline";
    }
    @Override
    public String toString(){
        return "Vehicle Name: " + super.name + ", Purchase Price: $" + super.purchasePrice;
    }
}
