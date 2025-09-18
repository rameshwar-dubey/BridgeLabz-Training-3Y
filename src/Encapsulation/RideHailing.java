package Encapsulation;

import java.util.ArrayList;
import java.util.List;

abstract class Transport {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;

    public Transport(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = currentLocation;
    }

    public abstract double calculateFare(double distance);
    public void getVehicleDetails() {
        System.out.println("Vehicle ID       : " + vehicleId);
        System.out.println("Driver Name      : " + driverName);
        System.out.println("Rate per Km      : $" + ratePerKm);
        System.out.println("Current Location : " + currentLocation);
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String location) {
        this.currentLocation = location;
    }
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

class TransportType1 extends Transport implements GPS {
    private double extraChargePerRide;

    public TransportType1(String vehicleId, String driverName, double ratePerKm, String currentLocation, double extraChargePerRide) {
        super(vehicleId, driverName, ratePerKm, currentLocation);
        this.extraChargePerRide = extraChargePerRide;
    }

    @Override
    public double calculateFare(double distance) {
        return (getRatePerKm() * distance) + extraChargePerRide;
    }

    @Override
    public String getCurrentLocation() {
        return super.getCurrentLocation();
    }

    @Override
    public void updateLocation(String newLocation) {
        setCurrentLocation(newLocation);
    }
}

class TransportType2 extends Transport implements GPS {
    public TransportType2(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm, currentLocation);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation() {
        return super.getCurrentLocation();
    }

    @Override
    public void updateLocation(String newLocation) {
        setCurrentLocation(newLocation);
    }
}

class TransportType3 extends Transport implements GPS {
    private double surgeCharge;

    public TransportType3(String vehicleId, String driverName, double ratePerKm, String currentLocation, double surgeCharge) {
        super(vehicleId, driverName, ratePerKm, currentLocation);
        this.surgeCharge = surgeCharge;
    }

    @Override
    public double calculateFare(double distance) {
        return (getRatePerKm() * distance) + surgeCharge;
    }

    @Override
    public String getCurrentLocation() {
        return super.getCurrentLocation();
    }

    @Override
    public void updateLocation(String newLocation) {
        setCurrentLocation(newLocation);
    }
}

public class RideHailing {
    public static void main(String[] args) {
        List<Transport> transports = new ArrayList<>();

        TransportType1 t1 = new TransportType1("T101", "Ramesh", 10, "Downtown", 5);
        TransportType2 t2 = new TransportType2("T202", "Anita", 5, "Uptown");
        TransportType3 t3 = new TransportType3("T303", "Suresh", 7, "Central Park", 2);
        transports.add(t1);
        transports.add(t2);
        transports.add(t3);
        double rideDistance = 12;
        System.out.println("=== Ride Details ===\n");
        for (Transport t : transports) {
            t.getVehicleDetails();
            double fare = t.calculateFare(rideDistance);
            System.out.printf("Fare for %.1f km: $%.2f%n", rideDistance, fare);
            System.out.println("Current Location: " + ((GPS) t).getCurrentLocation());
            System.out.println("----------------------------\n");
        }
        t1.updateLocation("Airport");
        System.out.println("Updated Location of T101: " + t1.getCurrentLocation());
    }
}
