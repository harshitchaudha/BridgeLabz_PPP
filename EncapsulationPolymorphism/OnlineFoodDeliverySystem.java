// Interface: Discountable
interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

// Abstract Class: FoodItem
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Encapsulation
    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void setPrice(double price) {
        if (price > 0) this.price = price;
        else System.out.println("Invalid price!");
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) this.quantity = quantity;
        else System.out.println("Invalid quantity!");
    }

    // Abstract Method
    public abstract double calculateTotalPrice();

    // Concrete Method
    public void getItemDetails() {
        System.out.println("Item: " + itemName + 
                           ", Price: " + price + 
                           ", Quantity: " + quantity);
    }
}

// Subclass: VegItem
class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10; // 10% discount
    }

    @Override
    public String getDiscountDetails() {
        return "Veg Discount: 10%";
    }
}

// Subclass: NonVegItem
class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + 50; // extra non-veg charge
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05; // 5% discount
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg Discount: 5%";
    }
}

// Main Class
public class OnlineFoodDeliverySystem {
    // Process order with polymorphism
    public static void processOrder(FoodItem[] items) {
        for (FoodItem item : items) {
            item.getItemDetails();
            double total = item.calculateTotalPrice();
            double discount = ((Discountable) item).applyDiscount();
            double finalAmount = total - discount;

            System.out.println(((Discountable) item).getDiscountDetails());
            System.out.println("Total Price: " + total);
            System.out.println("Discount: " + discount);
            System.out.println("Final Payable: " + finalAmount);
            System.out.println("----------------------------------");
        }
    }

    public static void main(String[] args) {
        FoodItem f1 = new VegItem("Paneer Tikka", 200, 2);
        FoodItem f2 = new NonVegItem("Chicken Biryani", 300, 1);

        FoodItem[] order = {f1, f2};
        processOrder(order); // Polymorphism in action
    }
}
