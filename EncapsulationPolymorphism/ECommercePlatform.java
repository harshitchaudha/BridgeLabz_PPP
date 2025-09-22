// Interface: Taxable
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Abstract Class: Product
abstract class Product {
    private String productId;
    private String name;
    private double price;

    // Constructor
    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Encapsulation: Getters & Setters
    public String getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price!");
        }
    }

    // Abstract Method
    public abstract double calculateDiscount();

    // Concrete Method
    public void displayProductDetails() {
        System.out.println("ID: " + productId +
                ", Name: " + name +
                ", Price: " + price);
    }
}

// Subclass: Electronics
class Electronics extends Product implements Taxable {
    public Electronics(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18; // 18% GST
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax: 18%";
    }
}

// Subclass: Clothing
class Clothing extends Product implements Taxable {
    public Clothing(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20; // 20% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05; // 5% GST
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax: 5%";
    }
}

// Subclass: Groceries
class Groceries extends Product implements Taxable {
    public Groceries(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.02; // 2% GST
    }

    @Override
    public String getTaxDetails() {
        return "Groceries Tax: 2%";
    }
}

// Main Class
public class ECommercePlatform {
    // Method to calculate and display final price
    public static void printFinalPrice(Product[] products) {
        for (Product p : products) {
            double discount = p.calculateDiscount();
            double tax = ((Taxable) p).calculateTax();
            double finalPrice = p.getPrice() + tax - discount;

            p.displayProductDetails();
            System.out.println(((Taxable) p).getTaxDetails());
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("--------------------------------");
        }
    }

    public static void main(String[] args) {
        Product p1 = new Electronics("P101", "Laptop", 60000);
        Product p2 = new Clothing("P102", "T-Shirt", 1500);
        Product p3 = new Groceries("P103", "Rice Bag", 2000);

        Product[] products = {p1, p2, p3};
        printFinalPrice(products); // Polymorphism in action
    }
}
