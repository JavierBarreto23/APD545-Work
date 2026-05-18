package ca.senecacollege.models;

public class Truck extends commercialVehicles{
    public Truck(String name, double purchasePrice, int currentMileage){
        super(name, purchasePrice, currentMileage);
        super.fuelType = "Petrol";
        super.serviceInterval = -1;
        super.maintenanceCost = 2135.89;
    }
}
