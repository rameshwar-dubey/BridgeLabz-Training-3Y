package Encapsulation;

import java.util.ArrayList;
import java.util.List;

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);
    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type          : " + type);
        System.out.println("Rental Rate   : $" + rentalRate + " per day");
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }
}

interface Insurable {
    double calculateInsurance();
    void getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    private double insuranceAmount;
    private String policyNumber;

    public Car(String vehicleNumber, double rentalRate, double insuranceAmount, String policyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insuranceAmount = insuranceAmount;
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return insuranceAmount;
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Policy: " + policyNumber);
        System.out.printf("Insurance Amount: $%.2f%n", insuranceAmount);
    }
}

class Bike extends Vehicle implements Insurable {
    private double insuranceAmount;
    private String policyNumber;

    public Bike(String vehicleNumber, double rentalRate, double insuranceAmount, String policyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insuranceAmount = insuranceAmount;
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.9;
    }

    @Override
    public double calculateInsurance() {
        return insuranceAmount;
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Policy: " + policyNumber);
        System.out.printf("Insurance Amount: $%.2f%n", insuranceAmount);
    }
}

class Truck extends Vehicle implements Insurable {
    private double insuranceAmount;
    private String policyNumber;

    public Truck(String vehicleNumber, double rentalRate, double insuranceAmount, String policyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insuranceAmount = insuranceAmount;
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.2;
    }

    @Override
    public double calculateInsurance() {
        return insuranceAmount;
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Policy: " + policyNumber);
        System.out.printf("Insurance Amount: $%.2f%n", insuranceAmount);
    }
}

public class VehicleRental {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        Car car = new Car("CAR123", 50, 500, "CARPOL123");
        Bike bike = new Bike("BIKE456", 20, 100, "BIKEPOL456");
        Truck truck = new Truck("TRUCK789", 100, 1000, "TRUCKPOL789");
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(truck);
        int rentalDays = 5;
        System.out.println("=== Vehicle Rental & Insurance Details ===\n");
        for (Vehicle v : vehicles) {
            v.displayDetails();
            System.out.printf("Rental Cost for %d days: $%.2f%n", rentalDays, v.calculateRentalCost(rentalDays));
            if (v instanceof Insurable) {
                Insurable insurableVehicle = (Insurable) v;
                insurableVehicle.getInsuranceDetails();
            }
            System.out.println("----------------------------\n");
        }
    }
}

