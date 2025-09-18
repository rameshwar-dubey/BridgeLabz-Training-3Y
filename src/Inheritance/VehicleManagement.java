package Inheritance;

class Vehicle1 {
    protected String model;
    protected int maxSpeed;

    public Vehicle1(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void displayInfo() {
        System.out.println("Model    : " + model);
        System.out.println("MaxSpeed : " + maxSpeed + " km/h");
    }
}

interface Refuelable {
    void refuel();
}

class ElectricVehicle extends Vehicle1 {
    private int batteryPercentage;

    public ElectricVehicle(String model, int maxSpeed, int batteryPercentage) {
        super(model, maxSpeed);
        this.batteryPercentage = batteryPercentage;
    }

    public void charge() {
        System.out.println(model + " is charging. Battery at " + batteryPercentage + "%");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery   : " + batteryPercentage + "%");
    }
}

class PetrolVehicle extends Vehicle1 implements Refuelable {
    private double fuelLevel;

    public PetrolVehicle(String model, int maxSpeed, double fuelLevel) {
        super(model, maxSpeed);
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling. Fuel level at " + fuelLevel + " liters");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fuel Level: " + fuelLevel + " liters");
    }
}

public class VehicleManagement {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 250, 80);
        PetrolVehicle pv = new PetrolVehicle("Honda Civic", 200, 40);

        System.out.println("=== Vehicle Information ===\n");

        ev.displayInfo();
        ev.charge();

        System.out.println("\n-------------------\n");

        pv.displayInfo();
        pv.refuel();
    }
}
