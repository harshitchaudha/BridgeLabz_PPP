package Inheritance.HierarchialInheritance;

// Superclass
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayRole() {
        System.out.println("Generic Person");
    }
}

// Subclass 1
class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    void displayRole() {
        System.out.println("Teacher: " + name + ", Subject: " + subject);
    }
}

// Subclass 2
class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    void displayRole() {
        System.out.println("Student: " + name + ", Grade: " + grade);
    }
}

// Subclass 3
class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    void displayRole() {
        System.out.println("Staff: " + name + ", Department: " + department);
    }
}

// Test
public class SchoolSystemTest {
    public static void main(String[] args) {
        Person t = new Teacher("Alice", 35, "Mathematics");
        Person s = new Student("Bob", 16, "10th Grade");
        Person st = new Staff("Charlie", 40, "Administration");

        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}
