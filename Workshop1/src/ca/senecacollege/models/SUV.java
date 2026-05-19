/*Workshop # [1]
Course: [Subject #] - [Semester]
Last Name: [Barreto Lara]
First Name: [Javier]
ID: [172535221]
This assignment represents my own work in accordance
//with Seneca Academic Policy.
Date: [May 20, 2026]*/

package ca.senecacollege.models;

import ca.senecacollege.abstracts.passengerVehicles;

public class SUV extends passengerVehicles {
    public SUV(String name, double purchasePrice, int currentMileage){
        super(name, purchasePrice, currentMileage);
        super.primaryFunction = "Family transportation, client visits";
        super.serviceInterval = 12000;//-1 for not applicable
        super.maintenanceCost = 450.00;
        super.fuelType = "Hybrid";

    }
    @Override
    public String toString(){
        return "Vehicle Name: " + super.name + ", Purchase Price: $" + super.purchasePrice;
    }
}
