package ca.senecacollege.abstracts;

public abstract class Vehicle {
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

    public String toString(){
        String info = "Name: " + this.name + "\n" +
                "Purchase Price: " + this.purchasePrice + "\n"+
                "Current Mileage: " + this.getCurrentMileage() + "\n";
        return info;
    }

    public abstract int compareTo(Vehicle other);

}