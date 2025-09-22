package Constructors.AccessModifiers;
class EmployeeRecords {
    public int employeeID;
    private String department;
    private double salary;

    public EmployeeRecords(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }
}

class Manager extends EmployeeRecords {
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }
    public void displayInfo() {
        System.out.println("Manager ID: " + employeeID + ", Department: " + getDepartment());
    }

    public static void main(String[] args) {
        Manager m = new Manager(1, "HR", 50000.0);
        m.displayInfo();
        System.out.println("Salary: " + m.getSalary());
        m.setSalary(55000.0);
        System.out.println("Updated Salary: " + m.getSalary());
    }
}
