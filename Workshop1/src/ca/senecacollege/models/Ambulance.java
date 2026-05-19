package ca.senecacollege.models;


import ca.senecacollege.abstracts.specializedVehicle;

public class Ambulance extends specializedVehicle {
    public Ambulance(String name, double purchasePrice, int currentMileage){
        super(name, purchasePrice,currentMileage);
        super.primaryFunction = "Emergency medical transport, life-saving\n";
        super.serviceInterval = 8000;
        super.maintenanceCost = 800.00;
        super.fuelType = "Diesel";
    }
    @Override
    public String toString(){
        return "Vehicle Name: " + super.name + ", Purchase Price: $" + super.purchasePrice;
    }
}
