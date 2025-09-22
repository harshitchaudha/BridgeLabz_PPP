// Interface: Insurable
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Abstract Class: Vehicle
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    // Constructor
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Encapsulation
    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    public void setRentalRate(double rentalRate) {
        if (rentalRate > 0) {
            this.rentalRate = rentalRate;
        } else {
            System.out.println("Invalid rental rate!");
        }
    }

    // Abstract Method
    public abstract double calculateRentalCost(int days);

    // Concrete Method
    public void displayVehicleDetails() {
        System.out.println("Vehicle No: " + vehicleNumber +
                ", Type: " + type +
                ", Rate per Day: " + rentalRate);
    }
}

// Subclass: Car
class Car extends Vehicle implements Insurable {
    public Car(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getRentalRate(); // simple per-day charge
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.15; // 15% of rental rate
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance: 15% of rental rate";
    }
}

// Subclass: Bike
class Bike extends Vehicle implements Insurable {
    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getRentalRate(); // cheaper than car
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05; // 5% of rental rate
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance: 5% of rental rate";
    }
}

// Subclass: Truck
class Truck extends Vehicle implements Insurable {
    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getRentalRate() * 1.2; // trucks have extra charges
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.25; // 25% of rental rate
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance: 25% of rental rate";
    }
}

// Main Class
public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle v1 = new Car("C101", 2000);
        Vehicle v2 = new Bike("B202", 500);
        Vehicle v3 = new Truck("T303", 3000);

        Vehicle[] vehicles = {v1, v2, v3};

        int days = 5; // suppose all vehicles rented for 5 days

        for (Vehicle v : vehicles) {
            v.displayVehicleDetails();
            double rentalCost = v.calculateRentalCost(days);
            double insuranceCost = ((Insurable) v).calculateInsurance();
            System.out.println(((Insurable) v).getInsuranceDetails());
            System.out.println("Rental Cost for " + days + " days: " + rentalCost);
            System.out.println("Insurance Cost: " + insuranceCost);
            System.out.println("Total Cost: " + (rentalCost + insuranceCost));
            System.out.println("--------------------------------");
        }
    }
}
