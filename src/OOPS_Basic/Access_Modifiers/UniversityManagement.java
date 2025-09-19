package OOPS_Basic.Access_Modifiers;

class Student {
    public int rollNumber;     // Public
    protected String name;     // Protected
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        if(CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA value.");
        }
    }

    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name       : " + name);
        System.out.println("CGPA       : " + CGPA);
    }
}

class PostgraduateStudent extends Student {
    private String specialization;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void displayPostgraduateDetails() {
        System.out.println("Roll Number   : " + rollNumber);
        System.out.println("Name          : " + name);
        System.out.println("CGPA          : " + getCGPA());
        System.out.println("Specialization: " + specialization);
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Ramesh", 8.5);
        s1.displayStudentDetails();
        System.out.println();

        s1.setCGPA(9.0);
        System.out.println("Updated CGPA: " + s1.getCGPA());
        System.out.println();

        PostgraduateStudent pg1 = new PostgraduateStudent(201, "Sita", 9.2, "Data Science");
        pg1.displayPostgraduateDetails();
    }
}

