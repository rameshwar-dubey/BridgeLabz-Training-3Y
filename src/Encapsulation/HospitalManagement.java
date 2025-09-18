package Encapsulation;

import java.util.ArrayList;
import java.util.List;

abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateBill();
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name      : " + name);
        System.out.println("Age       : " + age);
    }

    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private double dailyRoomRate;
    private int daysAdmitted;
    private List<String> medicalHistory;

    public InPatient(int patientId, String name, int age, double dailyRoomRate, int daysAdmitted) {
        super(patientId, name, age);
        this.dailyRoomRate = dailyRoomRate;
        this.daysAdmitted = daysAdmitted;
        this.medicalHistory = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return dailyRoomRate * daysAdmitted;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for " + getName() + ":");
        if (medicalHistory.isEmpty()) {
            System.out.println("  No records available.");
        } else {
            for (String r : medicalHistory) {
                System.out.println("  - " + r);
            }
        }
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> medicalHistory;

    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicalHistory = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for " + getName() + ":");
        if (medicalHistory.isEmpty()) {
            System.out.println("  No records available.");
        } else {
            for (String r : medicalHistory) {
                System.out.println("  - " + r);
            }
        }
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();

        InPatient p1 = new InPatient(101, "Ramesh", 45, 500.0, 3);
        OutPatient p2 = new OutPatient(102, "Anita", 30, 150.0);
        patients.add(p1);
        patients.add(p2);
        p1.addRecord("Blood Test - Normal");
        p1.addRecord("X-Ray - Minor fracture");
        p2.addRecord("General Consultation - Fever");
        System.out.println("=== Patient Details and Billing ===\n");
        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.printf("Total Bill: $%.2f%n", patient.calculateBill());
            if (patient instanceof MedicalRecord) {
                ((MedicalRecord) patient).viewRecords();
            }
            System.out.println("----------------------------\n");
        }
    }
}
