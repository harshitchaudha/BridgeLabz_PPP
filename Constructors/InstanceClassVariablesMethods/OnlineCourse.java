package Constructors.InstanceClassVariablesMethods;

public class OnlineCourse {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "Default Institute";

    public OnlineCourse(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    public void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks, Fee: " + fee + ", Institute: " + instituteName);
    }
    public static void updateInstituteName(String name) {
        instituteName = name;
    }
    public static void main(String[] args) {
        OnlineCourse c1 = new OnlineCourse("Java Basics", 8, 1000.0);
        c1.displayCourseDetails();
        OnlineCourse.updateInstituteName("Tech Academy");
        OnlineCourse c2 = new OnlineCourse("Python", 6, 900.0);
        c2.displayCourseDetails();
    }
}

