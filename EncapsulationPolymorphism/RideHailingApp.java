// Interface: GPS
interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

// Abstract Class: Vehicle
abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Encapsulation
    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }

    public void setRatePerKm(double ratePerKm) {
        if (ratePerKm > 0) this.ratePerKm = ratePerKm;
        else System.out.println("Invalid rate!");
    }

    // Abstract Method
    public abstract double calculateFare(double distance);

    // Concrete Method
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate/km: " + ratePerKm);
    }
}

// Subclass: Car
class Car extends Vehicle implements GPS {
    private String currentLocation;

    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() { return currentLocation; }

    @Override
    public void updateLocation(String location) { this.currentLocation = location; }
}

// Subclass: Bike
class Bike extends Vehicle implements GPS {
    private String currentLocation;

    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 0.8; // 20% cheaper
    }

    @Override
    public String getCurrentLocation() { return currentLocation; }

    @Override
    public void updateLocation(String location) { this.currentLocation = location; }
}

// Subclass: Auto
class Auto extends Vehicle implements GPS {
    private String currentLocation;

    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 20; // fixed base charge
    }

    @Override
    public String getCurrentLocation() { return currentLocation; }

    @Override
    public void updateLocation(String location) { this.currentLocation = location; }
}

// Main Class
public class RideHailingApp {
    // Polymorphism: process all vehicles
    public static void processRides(Vehicle[] vehicles, double distance) {
        for (Vehicle v : vehicles) {
            v.getVehicleDetails();
            double fare = v.calculateFare(distance);
            System.out.println("Ride Distance: " + distance + " km");
            System.out.println("Fare: " + fare);

            // Access GPS
            if (v instanceof GPS) {
                ((GPS) v).updateLocation("Downtown");
                System.out.println("Current Location: " + ((GPS) v).getCurrentLocation());
            }

            System.out.println("----------------------------------");
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Car("C101", "Arjun", 15);
        Vehicle v2 = new Bike("B202", "Karan", 10);
        Vehicle v3 = new Auto("A303", "Ravi", 12);

        Vehicle[] rides = {v1, v2, v3};
        processRides(rides, 10); // Polymorphism in action
    }
}
