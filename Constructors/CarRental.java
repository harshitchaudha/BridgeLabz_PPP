package Constructors;

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate;

    public CarRental() {
        this.customerName = "";
        this.carModel = "";
        this.rentalDays = 0;
        this.dailyRate = 1000.0;
    }
    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }
    public void display() {
        System.out.println("Customer: " + customerName + ", Model: " + carModel + ", Days: " + rentalDays + ", Total Cost: " + calculateTotalCost());
    }
    public static void main(String[] args) {
        CarRental rental = new CarRental("Vikram", "Toyota", 5, 1200.0);
        rental.display();
    }
}
