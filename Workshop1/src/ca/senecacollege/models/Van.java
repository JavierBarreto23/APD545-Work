/*Workshop # [1]
Course: [Subject #] - [Semester]
Last Name: [Barreto Lara]
First Name: [Javier]
ID: [172535221]
This assignment represents my own work in accordance
//with Seneca Academic Policy.
Date: [May 20, 2026]*/

package ca.senecacollege.models;

import ca.senecacollege.abstracts.commercialVehicles;

public class Van extends commercialVehicles {
    public Van(String name, double purchasePrice, int currentMileage){
        super(name, purchasePrice, currentMileage);
        super.primaryFunction = "Passenger group transport, deliveries";
        super.serviceInterval = 10000;
        super.maintenanceCost = 400.00;
        super.fuelType = "Gasoline";
    }
    @Override
    public String toString(){
        return "Vehicle Name: " + super.name + ", Purchase Price: $" + super.purchasePrice;
    }
}
