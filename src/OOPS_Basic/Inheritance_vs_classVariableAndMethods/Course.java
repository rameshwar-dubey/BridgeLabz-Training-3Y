package OOPS_Basic.Inheritance_vs_classVariableAndMethods;

public class Course {
    private String courseName;
    private int duration; // in weeks
    private double fee;

    private static String instituteName = "Default Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name   : " + courseName);
        System.out.println("Duration (wks): " + duration);
        System.out.println("Fee           : " + fee);
        System.out.println("Institute     : " + instituteName);
    }

    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 8, 15000);
        Course c2 = new Course("Python Programming", 6, 12000);

        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
        System.out.println();
        Course.updateInstituteName("Tech Academy");
        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
    }
}

