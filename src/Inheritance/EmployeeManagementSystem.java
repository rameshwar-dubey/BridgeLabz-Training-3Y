package Inheritance;


class Employee {
    protected String name;
    protected int id;
    protected double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name       : " + name);
        System.out.println("Salary     : $" + salary);
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role       : Manager");
        System.out.println("Team Size  : " + teamSize);
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role       : Developer");
        System.out.println("Language   : " + programmingLanguage);
    }
}

class Intern extends Employee {
    private int durationMonths;

    public Intern(String name, int id, double salary, int durationMonths) {
        super(name, id, salary);
        this.durationMonths = durationMonths;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role       : Intern");
        System.out.println("Duration   : " + durationMonths + " months");
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee m1 = new Manager("Ramesh", 101, 80000, 5);
        Employee d1 = new Developer("Anita", 102, 60000, "Java");
        Employee i1 = new Intern("Suresh", 103, 20000, 6);

        System.out.println("=== Employee Details ===\n");
        m1.displayDetails();
        System.out.println();
        d1.displayDetails();
        System.out.println();
        i1.displayDetails();
    }
}

