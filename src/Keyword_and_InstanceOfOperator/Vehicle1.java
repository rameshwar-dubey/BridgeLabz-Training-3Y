package Keyword_and_InstanceOfOperator;

public class Vehicle1 {
    private static double registrationFee = 100.0;

    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle1(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        if (newFee >= 0.0) {
            registrationFee = newFee;
        } else {
            System.out.println("Invalid registration fee. Please enter a non-negative value.");
        }
    }

    public void displayRegistrationDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.printf("Registration Fee: $%.2f%n", registrationFee);
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public static void main(String[] args) {
        Vehicle1.updateRegistrationFee(150.0);
        Vehicle1 vehicle1 = new Vehicle1("Honest raj", "Sedan", "ABC123");
        Vehicle1 vehicle2 = new Vehicle1("Price danish", "SUV", "XYZ789");
        vehicle1.displayRegistrationDetails();
        System.out.println();
        vehicle2.displayRegistrationDetails();
    }
}

