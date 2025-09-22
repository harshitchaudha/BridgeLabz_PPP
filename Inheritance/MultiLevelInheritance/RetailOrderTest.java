package Inheritance.MultiLevelInheritance;

// Base class
class Order {
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order placed on " + orderDate;
    }
}

// Subclass 1
class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order shipped. Tracking No: " + trackingNumber;
    }
}

// Subclass 2 (extends ShippedOrder → multilevel)
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }
}

// Test
public class RetailOrderTest {
    public static void main(String[] args) {
        Order o = new Order(1001, "2025-09-20");
        ShippedOrder so = new ShippedOrder(1002, "2025-09-18", "TRK12345");
        DeliveredOrder do1 = new DeliveredOrder(1003, "2025-09-15", "TRK98765", "2025-09-19");

        System.out.println(o.getOrderStatus());
        System.out.println(so.getOrderStatus());
        System.out.println(do1.getOrderStatus());
    }
}
