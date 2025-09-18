package Object_Oriented_Design_Principle.Object_Modelling;

import java.util.ArrayList;
import java.util.List;
class Learner {
    private String name;
    private List<Subject> subjects;

    public Learner(String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollSubject(Subject subject) {
        if (!subjects.contains(subject)) {
            subjects.add(subject);
            subject.addLearner(this);
            System.out.println(name + " enrolled in " + subject.getSubjectName());
        }
    }

    public void showSubjects() {
        System.out.println("Subjects for " + name + ":");
        for (Subject s : subjects) {
            System.out.println(" - " + s.getSubjectName());
        }
    }
}

class Professor {
    private String name;
    private List<Subject> subjects;

    public Professor(String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void assignSubject(Subject subject) {
        if (!subjects.contains(subject)) {
            subjects.add(subject);
            subject.addProfessor(this);
            System.out.println(name + " assigned to teach " + subject.getSubjectName());
        }
    }

    public void showSubjects() {
        System.out.println("Subjects taught by " + name + ":");
        for (Subject s : subjects) {
            System.out.println(" - " + s.getSubjectName());
        }
    }
}

class Subject {
    private String subjectName;
    private List<Learner> learners;
    private List<Professor> professors;

    public Subject(String subjectName) {
        this.subjectName = subjectName;
        this.learners = new ArrayList<>();
        this.professors = new ArrayList<>();
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void addLearner(Learner learner) {
        if (!learners.contains(learner)) {
            learners.add(learner);
        }
    }

    public void addProfessor(Professor professor) {
        if (!professors.contains(professor)) {
            professors.add(professor);
        }
    }

    public void showLearners() {
        System.out.println("Learners enrolled in " + subjectName + ":");
        for (Learner l : learners) {
            System.out.println(" - " + l.getName());
        }
    }

    public void showProfessors() {
        System.out.println("Professors teaching " + subjectName + ":");
        for (Professor p : professors) {
            System.out.println(" - " + p.getName());
        }
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {

        Learner l1 = new Learner("Ramesh");
        Learner l2 = new Learner("Anita");

        Professor p1 = new Professor("Dr. Sharma");
        Professor p2 = new Professor("Dr. Verma");

        Subject s1 = new Subject("Mathematics");
        Subject s2 = new Subject("Physics");

        p1.assignSubject(s1);
        p2.assignSubject(s2);

        l1.enrollSubject(s1);
        l1.enrollSubject(s2);
        l2.enrollSubject(s1);

        System.out.println();

        // Show details
        l1.showSubjects();
        l2.showSubjects();
        System.out.println();

        p1.showSubjects();
        p2.showSubjects();
        System.out.println();

        s1.showLearners();
        s1.showProfessors();
        System.out.println();
        s2.showLearners();
        s2.showProfessors();
    }
}
