// Interface: Department
interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

// Abstract Class: Employee
abstract class Employee {
    private String employeeId;
    private String name;
    private double baseSalary;
    private String department;

    // Constructor
    public Employee(String employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Encapsulation: Getters and Setters
    public String getEmployeeId() { return employeeId; }

    public String getName() { return name; }

    public double getBaseSalary() { return baseSalary; }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary > 0) {
            this.baseSalary = baseSalary;
        } else {
            System.out.println("Invalid base salary!");
        }
    }

    public void setDepartment(String department) { this.department = department; }
    public String getDepartment() { return department; }

    // Abstract Method
    public abstract double calculateSalary();

    // Concrete Method
    public void displayDetails() {
        System.out.println("ID: " + employeeId +
                ", Name: " + name +
                ", Department: " + department +
                ", Base Salary: " + baseSalary +
                ", Final Salary: " + calculateSalary());
    }
}

// Subclass: Full-Time Employee
class FullTimeEmployee extends Employee implements Department {
    public FullTimeEmployee(String employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary(); // Fixed salary
    }

    @Override
    public void assignDepartment(String deptName) {
        setDepartment(deptName);
    }

    @Override
    public String getDepartmentDetails() {
        return "Full-Time Dept: " + getDepartment();
    }
}

// Subclass: Part-Time Employee
class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String employeeId, String name, double hourlyRate, int hoursWorked) {
        super(employeeId, name, 0); // baseSalary not used directly
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void assignDepartment(String deptName) {
        setDepartment(deptName);
    }

    @Override
    public String getDepartmentDetails() {
        return "Part-Time Dept: " + getDepartment();
    }
}

// Main Class: Test the System
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("E101", "Alice", 50000);
        Employee e2 = new PartTimeEmployee("E102", "Bob", 500, 40);

        // Assign departments
        ((Department) e1).assignDepartment("HR");
        ((Department) e2).assignDepartment("IT");

        // Polymorphism: process employees with Employee reference
        Employee[] employees = {e1, e2};

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println(((Department) emp).getDepartmentDetails());
            System.out.println("------------------------------------------------");
        }
    }
}
