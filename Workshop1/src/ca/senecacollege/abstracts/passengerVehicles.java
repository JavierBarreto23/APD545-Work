/*Workshop # [1]
Course: [Subject #] - [Semester]
Last Name: [Barreto Lara]
First Name: [Javier]
ID: [172535221]
This assignment represents my own work in accordance
//with Seneca Academic Policy.
Date: [May 20, 2026]*/

package ca.senecacollege.abstracts;

public abstract class passengerVehicles extends Vehicle {

    public passengerVehicles(String name, double purchasePrice, int currentMileage){
        super(name, purchasePrice, currentMileage);

    }

    @Override
    public String getCategory() {
        return super.primaryFunction;
    }

    //I have no idea how to implement this function
    @Override
    public int compareTo(Vehicle other) {
        return 0;
    }
}
