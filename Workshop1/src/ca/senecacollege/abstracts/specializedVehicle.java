package ca.senecacollege.abstracts;

public abstract class specializedVehicle extends Vehicle {
    public specializedVehicle(String name, double purchasePrice, int currentMileage) {
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
