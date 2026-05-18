package ca.senecacollege.controllers;

import ca.senecacollege.abstracts.Vehicle;

public class vehicleMaintenance {
    public vehicleMaintenance() {}
    public int getServiceInterval(Vehicle v){
        return v.serviceInterval;
    }

    public double getMaintenanceCost(Vehicle v){
        return v.maintenanceCost;
    }
}
