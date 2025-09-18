package Inheritance;

import java.time.LocalDate;

class Order {
    protected int orderId;
    protected LocalDate orderDate;

    public Order(int orderId, LocalDate orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order Placed";
    }

    public void displayInfo() {
        System.out.println("Order ID   : " + orderId);
        System.out.println("Order Date : " + orderDate);
        System.out.println("Status     : " + getOrderStatus());
    }
}

class ShippedOrder extends Order {
    protected String trackingNumber;

    public ShippedOrder(int orderId, LocalDate orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order Shipped";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tracking No: " + trackingNumber);
    }
}

class DeliveredOrder extends ShippedOrder {
    private LocalDate deliveryDate;

    public DeliveredOrder(int orderId, LocalDate orderDate, String trackingNumber, LocalDate deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order Delivered";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

public class OnlineRetail {
    public static void main(String[] args) {
        Order o1 = new Order(101, LocalDate.of(2025, 9, 18));
        ShippedOrder o2 = new ShippedOrder(102, LocalDate.of(2025, 9, 15), "TRK12345");
        DeliveredOrder o3 = new DeliveredOrder(103, LocalDate.of(2025, 9, 10), "TRK67890", LocalDate.of(2025, 9, 17));

        System.out.println("=== Order Details ===\n");
        o1.displayInfo();
        System.out.println("\n-------------------\n");
        o2.displayInfo();
        System.out.println("\n-------------------\n");
        o3.displayInfo();
    }
}

