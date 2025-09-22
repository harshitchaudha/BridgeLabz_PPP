package Inheritance.MultiLevelInheritance;

// Base class
class Course {
    String courseName;
    int duration; // in weeks

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayCourse() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks");
    }
}

// Subclass 1
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    void displayCourse() {
        super.displayCourse();
        System.out.println("Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass 2 (extends OnlineCourse → multilevel)
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded,
                     double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    void displayCourse() {
        super.displayCourse();
        System.out.println("Fee: " + fee + ", Discount: " + discount + "%");
    }
}

// Test
public class CourseTest {
    public static void main(String[] args) {
        Course c = new Course("Java Basics", 4);
        OnlineCourse oc = new OnlineCourse("Python Programming", 6, "Udemy", true);
        PaidOnlineCourse poc = new PaidOnlineCourse("Data Structures", 8, "Coursera", true, 4999, 20);

        c.displayCourse();
        oc.displayCourse();
        poc.displayCourse();
    }
}
