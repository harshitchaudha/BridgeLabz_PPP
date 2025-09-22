package Constructors.AccessModifiers;

class UniversityStudent {
    public int rollNumber;
    protected String name;
    private double cgpa;

    public UniversityStudent(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }
    public double getCGPA() {
        return cgpa;
    }
    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }
}

class PostgraduateStudent extends UniversityStudent {
    public PostgraduateStudent(int rollNumber, String name, double cgpa) {
        super(rollNumber, name, cgpa);
    }
    public void showName() {
        System.out.println("Postgraduate student name: " + name);
    }

    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "Kiran", 8.7);
        System.out.println("Roll: " + pg.rollNumber);
        pg.showName();
        System.out.println("CGPA: " + pg.getCGPA());
        pg.setCGPA(9.1);
        System.out.println("Updated CGPA: " + pg.getCGPA());
    }
}


