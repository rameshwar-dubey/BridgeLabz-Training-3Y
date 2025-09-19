package OOPS_Basic.Access_Modifiers;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID : " + employeeID);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : " + salary);
    }
}

class Manager extends Employee {
    private String team;

    public Manager(int employeeID, String department, double salary, String team) {
        super(employeeID, department, salary);
        this.team = team;
    }

    public void displayManagerDetails() {
        System.out.println("Employee ID : " + employeeID);
        System.out.println("Department  : " + department);

        System.out.println("Salary      : " + getSalary());
        System.out.println("Team        : " + team);
    }
}

public class Company {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "IT", 50000);
        emp1.displayEmployeeDetails();
        System.out.println();

        emp1.setSalary(55000);
        System.out.println("Updated Salary: " + emp1.getSalary());
        System.out.println();

        Manager mgr1 = new Manager(201, "HR", 80000, "Recruitment Team");
        mgr1.displayManagerDetails();
    }
}

