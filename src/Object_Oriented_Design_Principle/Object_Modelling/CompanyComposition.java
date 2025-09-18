package Object_Oriented_Design_Principle.Object_Modelling;

import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department {
    private String deptName;
    private List<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public String getDeptName() {
        return deptName;
    }

    public void addEmployee(String empName) {
        employees.add(new Employee(empName));
    }

    public void showEmployees() {
        System.out.println("  Employees in " + deptName + ":");
        for (Employee emp : employees) {
            System.out.println("    - " + emp.getName());
        }
    }

    public void clearEmployees() {
        employees.clear();
        System.out.println("  All employees removed from " + deptName);
    }
}

class Company {
    private String companyName;
    private List<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    public void addEmployeeToDepartment(String deptName, String empName) {
        for (Department dept : departments) {
            if (dept.getDeptName().equals(deptName)) {
                dept.addEmployee(empName);
                return;
            }
        }
        System.out.println("Department " + deptName + " not found!");
    }

    public void showCompanyStructure() {
        System.out.println("Company: " + companyName);
        for (Department dept : departments) {
            System.out.println(" Department: " + dept.getDeptName());
            dept.showEmployees();
        }
    }

    public void deleteCompany() {
        System.out.println("Deleting company: " + companyName);
        for (Department dept : departments) {
            dept.clearEmployees();
        }
        departments.clear();
        System.out.println("All departments and employees removed.");
    }
}

public class CompanyComposition {
    public static void main(String[] args) {
        Company company = new Company("TechSoft Pvt Ltd");

        company.addDepartment("HR");
        company.addDepartment("IT");
        company.addDepartment("Finance");

        company.addEmployeeToDepartment("HR", "Ramesh");
        company.addEmployeeToDepartment("IT", "Suresh");
        company.addEmployeeToDepartment("Finance", "Mahesh");

        company.showCompanyStructure();
        company.deleteCompany();
        company.showCompanyStructure();
    }
}
