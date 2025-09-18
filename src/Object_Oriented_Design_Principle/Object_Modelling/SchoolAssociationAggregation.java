package Object_Oriented_Design_Principle.Object_Modelling;

import java.util.ArrayList;
import java.util.List;

class Course {
    private String courseName;
    private List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.addCourse(this);
        }
    }

    public void showEnrolledStudents() {
        System.out.println("Course: " + courseName + " has students:");
        for (Student s : enrolledStudents) {
            System.out.println(" - " + s.getName());
        }
    }
}

class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    public void viewCourses() {
        System.out.println("Student: " + name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println(" - " + c.getCourseName());
        }
    }
}

class School {
    private String schoolName;
    private List<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showStudents() {
        System.out.println("School: " + schoolName + " has students:");
        for (Student s : students) {
            System.out.println(" - " + s.getName());
        }
    }
}

public class SchoolAssociationAggregation {
    public static void main(String[] args) {

        School school = new School("Green Valley High School");

        Student s1 = new Student("Ramesh");
        Student s2 = new Student("Suresh");
        Student s3 = new Student("Anita");

        school.addStudent(s1);
        school.addStudent(s2);
        school.addStudent(s3);

        Course math = new Course("Mathematics");
        Course science = new Course("Science");
        Course history = new Course("History");

        math.enrollStudent(s1);
        math.enrollStudent(s2);

        science.enrollStudent(s1);
        science.enrollStudent(s3);

        history.enrollStudent(s2);

        school.showStudents();
        System.out.println();

        s1.viewCourses();
        s2.viewCourses();
        s3.viewCourses();
        System.out.println();

        math.showEnrolledStudents();
        science.showEnrolledStudents();
        history.showEnrolledStudents();
    }
}

