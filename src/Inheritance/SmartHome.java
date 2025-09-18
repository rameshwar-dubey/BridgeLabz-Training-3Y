package Inheritance;

class Device {
    protected String deviceId;
    protected boolean status;

    public Device(String deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID : " + deviceId);
        System.out.println("Status    : " + (status ? "ON" : "OFF"));
    }
}

class Thermostat extends Device {
    private double temperatureSetting;

    public Thermostat(String deviceId, boolean status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + " °C");
    }
}
public class SmartHome {
    public static void main(String[] args) {
        Thermostat t1 = new Thermostat("T1001", true, 24.5);

        System.out.println("=== Smart Home Device Status ===\n");
        t1.displayStatus();
    }
}

