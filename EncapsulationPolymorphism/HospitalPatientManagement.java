// Interface: Billable
interface Billable {
    double applyInsurance();
    String getInsuranceDetails();
}

// Abstract Class: Patient
abstract class Patient {
    private String name;
    private int age;
    private String disease;

    public Patient(String name, int age, String disease) {
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    // Encapsulation
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getDisease() { return disease; }

    public void setAge(int age) {
        if (age > 0) this.age = age;
        else System.out.println("Invalid age!");
    }

    public void setDisease(String disease) {
        if (disease != null && !disease.isEmpty()) this.disease = disease;
        else System.out.println("Invalid disease!");
    }

    // Abstract method
    public abstract double calculateBill();

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Disease: " + disease);
    }
}

// Subclass: InPatient
class InPatient extends Patient implements Billable {
    private double roomCharge;
    private double treatmentCharge;

    public InPatient(String name, int age, String disease, double roomCharge, double treatmentCharge) {
        super(name, age, disease);
        this.roomCharge = roomCharge;
        this.treatmentCharge = treatmentCharge;
    }

    @Override
    public double calculateBill() {
        return roomCharge + treatmentCharge;
    }

    @Override
    public double applyInsurance() {
        return calculateBill() * 0.20; // 20% insurance coverage
    }

    @Override
    public String getInsuranceDetails() {
        return "In-Patient Insurance: 20% coverage";
    }
}

// Subclass: OutPatient
class OutPatient extends Patient implements Billable {
    private double consultationFee;

    public OutPatient(String name, int age, String disease, double consultationFee) {
        super(name, age, disease);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public double applyInsurance() {
        return calculateBill() * 0.10; // 10% insurance coverage
    }

    @Override
    public String getInsuranceDetails() {
        return "Out-Patient Insurance: 10% coverage";
    }
}

// Main Class
public class HospitalPatientManagement {
    // Process Patients with polymorphism
    public static void processPatients(Patient[] patients) {
        for (Patient p : patients) {
            p.getPatientDetails();
            double bill = p.calculateBill();
            double insurance = ((Billable) p).applyInsurance();
            double finalBill = bill - insurance;

            System.out.println(((Billable) p).getInsuranceDetails());
            System.out.println("Total Bill: " + bill);
            System.out.println("Insurance Covered: " + insurance);
            System.out.println("Final Payable: " + finalBill);
            System.out.println("----------------------------------");
        }
    }

    public static void main(String[] args) {
        Patient p1 = new InPatient("Ravi", 40, "Pneumonia", 5000, 8000);
        Patient p2 = new OutPatient("Meera", 25, "Fever", 1200);

        Patient[] patients = {p1, p2};
        processPatients(patients); // Polymorphism in action
    }
}
