package Inheritance;

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println("Role    : Teacher");
        displayInfo();
        System.out.println("Subject : " + subject);
    }
}

class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        System.out.println("Role   : Student");
        displayInfo();
        System.out.println("Grade  : " + grade);
    }
}

class Staff extends Person {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void displayRole() {
        System.out.println("Role       : Staff");
        displayInfo();
        System.out.println("Department : " + department);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mr. Sharma", 40, "Mathematics");
        Student s1 = new Student("Anita", 16, "10th Grade");
        Staff st1 = new Staff("Ramesh", 35, "Administration");

        System.out.println("=== School Roles ===\n");
        t1.displayRole();
        System.out.println("\n-------------------\n");
        s1.displayRole();
        System.out.println("\n-------------------\n");
        st1.displayRole();
    }
}

