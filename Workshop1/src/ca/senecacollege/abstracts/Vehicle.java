package ca.senecacollege.abstracts;

import ca.senecacollege.interfaces.vehicleFilter;
import ca.senecacollege.interfaces.vehicleMaintenance;
import ca.senecacollege.interfaces.vehicleOperations;


public abstract class Vehicle implements vehicleOperations, vehicleMaintenance, vehicleFilter {
    public String name;
    public double purchasePrice;
    public int currentMileage;
    public int serviceInterval;
    public double maintenanceCost;
    public String primaryFunction;
    public String fuelType;

    public Vehicle(String name, double purchasePrice, int currentMileage) {
        this.name = name;
        this.purchasePrice = purchasePrice;
        this.currentMileage = currentMileage;
    }

    public abstract String getCategory();

    public int getCurrentMileage() {
        return this.currentMileage;
    }

    public double getPurchasePrice() {
        return this.purchasePrice;
    }

    public abstract String toString();

    public abstract int compareTo(Vehicle other);


    public String getPrimaryFunction() {
        return primaryFunction;
    }

    public String getFuelType(){
        return fuelType;
    }

    public int getServiceInterval(){
        return serviceInterval;
    }

    public double getMaintenanceCost(){
        return  maintenanceCost;
    }

    public boolean match(Vehicle v){
        return true;
    }


}