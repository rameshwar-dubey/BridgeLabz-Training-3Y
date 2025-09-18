package Inheritance;

class Course {
    protected String courseName;
    protected int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayInfo() {
        System.out.println("Course Name : " + courseName);
        System.out.println("Duration    : " + duration + " hours");
    }
}

class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Platform    : " + platform);
        System.out.println("Recorded    : " + (isRecorded ? "Yes" : "No"));
    }
}

class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fee         : $" + fee);
        System.out.println("Discount    : " + discount + "%");
        System.out.println("Final Fee   : $" + (fee - (fee * discount / 100)));
    }
}

public class CourseHierarcy {
    public static void main(String[] args) {
        Course c1 = new Course("Mathematics", 40);
        OnlineCourse c2 = new OnlineCourse("Physics", 50, "Zoom", true);
        PaidOnlineCourse c3 = new PaidOnlineCourse("Java Programming", 60, "Udemy", false, 200, 20);

        System.out.println("=== Course Details ===\n");
        c1.displayInfo();
        System.out.println("\n-------------------\n");
        c2.displayInfo();
        System.out.println("\n-------------------\n");
        c3.displayInfo();
    }
}
