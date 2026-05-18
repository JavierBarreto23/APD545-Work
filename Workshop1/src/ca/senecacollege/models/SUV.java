package ca.senecacollege.models;

public class SUV extends passengerVehicles{
    public SUV(String name, double purchasePrice, int currentMileage){
        super(name, purchasePrice, currentMileage);
        super.fuelType = "Diesel";
        super.serviceInterval = -1;//-1 for not applicable
        super.maintenanceCost = 1234.67;
    }
}
