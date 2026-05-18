package ca.senecacollege.models;

public class Van extends commercialVehicles{
    public Van(String name, double purchasePrice, int currentMileage){
        super(name, purchasePrice, currentMileage);
        super.fuelType = "Diesel";
        super.serviceInterval = -1;
        super.maintenanceCost = 2464.99;
    }
}
