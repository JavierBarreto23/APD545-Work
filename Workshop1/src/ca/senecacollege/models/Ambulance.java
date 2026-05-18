package ca.senecacollege.models;


public class Ambulance extends specializedVehicle{
    public Ambulance(String name, double purchasePrice, int currentMileage){
        super(name, purchasePrice,currentMileage);
        super.fuelType = "Petrol";
        super.serviceInterval = 30;
        super.maintenanceCost = 4599.99;
    }
}
