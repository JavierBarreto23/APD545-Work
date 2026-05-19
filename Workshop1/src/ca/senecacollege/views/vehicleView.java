package ca.senecacollege.views;
import ca.senecacollege.abstracts.Vehicle;

public class vehicleView {
    //this func will display primary function, purchase price,
    // required service interval, and maintenance cost information.
    //of the vehicle that needs maintenance the most (calculation will be done in controllers)
    public void displayMaintenance(Vehicle v){
        System.out.println("The vehicle requiring the most urgent maintenance is: " + v.name);
        System.out.println(v.name + "'s purchase price is: $" + v.getPurchasePrice());
        System.out.println(v.name + "'s primary function is: " + v.getPrimaryFunction());
        System.out.println(v.name + "'s service interval is: Every " + v.getPurchasePrice()
                + " km");
        System.out.println(v.name + "'s maintenance cost is: $" + v.getMaintenanceCost() +"\n");
    }

    //with an array of vehicles objects sorted from the most pricey to the least pricey
    //display each vehicle
    public void displayVehiclesByPurchasePrice(Vehicle[] vehicles){
        for (Vehicle v: vehicles) {
            System.out.println(v.toString());
        }
    }
}
