package Object_Oriented_Design_Principle.Object_Modelling;

import java.util.ArrayList;
import java.util.List;

class Doctor {
    private String name;
    private String specialization;
    private List<Patient> patients;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }

        patient.addDoctor(this);

        System.out.println("Consultation: Dr. " + name + " (Specialist: " + specialization +
                ") is consulting patient " + patient.getName());
    }

    public void showPatients() {
        System.out.println("Patients of Dr. " + name + ":");
        for (Patient p : patients) {
            System.out.println(" - " + p.getName());
        }
    }
}

class Patient {
    private String name;
    private int age;
    private List<Doctor> doctors;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public void showDoctors() {
        System.out.println("Doctors consulted by " + name + ":");
        for (Doctor d : doctors) {
            System.out.println(" - Dr. " + d.getName() + " (" + d.getSpecialization() + ")");
        }
    }
}

class Hospital {
    private String hospitalName;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void showHospitalInfo() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Doctors:");
        for (Doctor d : doctors) {
            System.out.println(" - Dr. " + d.getName() + " (" + d.getSpecialization() + ")");
        }
        System.out.println("Patients:");
        for (Patient p : patients) {
            System.out.println(" - " + p.getName() + " (Age " + p.getAge() + ")");
        }
    }
}

public class HospitalAssociation {
    public static void main(String[] args) {

        Hospital hospital = new Hospital("City Care Hospital");

        Doctor d1 = new Doctor("Sharma", "Cardiologist");
        Doctor d2 = new Doctor("Verma", "Neurologist");

        Patient p1 = new Patient("Ramesh", 45);
        Patient p2 = new Patient("Anita", 30);

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        System.out.println();

        d1.showPatients();
        d2.showPatients();
        System.out.println();
        p1.showDoctors();
        p2.showDoctors();

        System.out.println();
        hospital.showHospitalInfo();
    }
}

