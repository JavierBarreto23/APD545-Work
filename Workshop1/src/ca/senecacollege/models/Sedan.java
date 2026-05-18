package ca.senecacollege.models;

public class Sedan extends passengerVehicles{
    public Sedan(String name, double purchasePrice, int currentMileage){
        super(name, purchasePrice, currentMileage);
        super.fuelType = "Petrol";
        super.serviceInterval = -1; //-1 for not applicable
        super.maintenanceCost = 1600.00;
    }
}
