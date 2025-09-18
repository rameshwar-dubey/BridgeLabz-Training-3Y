package Object_Oriented_Design_Principle.Object_Modelling;

import java.util.ArrayList;
import java.util.List;

class Faculty {
    private String name;
    private String specialization;

    public Faculty(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void showInfo() {
        System.out.println(" Faculty: " + name + " | Specialization: " + specialization);
    }
}

class Dept {
    private String deptName;
    private List<Faculty> facultyList;

    public Dept(String deptName) {
        this.deptName = deptName;
        this.facultyList = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        facultyList.add(faculty);
    }

    public void showDeptInfo() {
        System.out.println(" Department: " + deptName);
        if (facultyList.isEmpty()) {
            System.out.println("   No faculty assigned.");
        } else {
            for (Faculty f : facultyList) {
                f.showInfo();
            }
        }
    }
}

class University {
    private String universityName;
    private List<Dept> departments;

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Dept dept) {
        departments.add(dept);
    }

    public void showUniversityInfo() {
        System.out.println("University: " + universityName);
        for (Dept dept : departments) {
            dept.showDeptInfo();
        }
    }

    public void closeUniversity() {
        System.out.println("Closing University: " + universityName);
        departments.clear();
    }
}

public class UniversityCompositionAggregation {
    public static void main(String[] args) {
        // Create Faculties (Aggregation → independent existence)
        Faculty f1 = new Faculty("Dr. Ramesh", "Physics");
        Faculty f2 = new Faculty("Dr. Anita", "Mathematics");
        Faculty f3 = new Faculty("Dr. Suresh", "Computer Science");

        University uni = new University("ABC University");

        Dept physics = new Dept("Physics Department");
        Dept math = new Dept("Mathematics Department");
        Dept cs = new Dept("Computer Science Department");

        physics.addFaculty(f1);
        math.addFaculty(f2);
        cs.addFaculty(f3);

        uni.addDepartment(physics);
        uni.addDepartment(math);
        uni.addDepartment(cs);

        uni.showUniversityInfo();

        System.out.println("\nIndependent Faculty (outside university):");
        Faculty f4 = new Faculty("Dr. Meera", "Biology");
        f4.showInfo();

        uni.closeUniversity();
        System.out.println("\nAfter closing University:");
        uni.showUniversityInfo();

    }
}
