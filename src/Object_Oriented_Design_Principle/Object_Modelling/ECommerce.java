package Object_Oriented_Design_Principle.Object_Modelling;

import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void showProduct() {
        System.out.println(" - " + name + " | Price: $" + price);
    }
}

class Order {
    private static int nextOrderId = 1001;
    private int orderId;
    private User user;
    private List<Product> products;

    public Order(User user) {
        this.orderId = nextOrderId++;
        this.user = user;
        this.products = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId + " | User: " + user.getName());
        System.out.println("Products in this order:");
        for (Product p : products) {
            p.showProduct();
        }
    }
}

class User {
    private String name;
    private List<Order> orders;

    public User(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Order placeOrder() {
        Order newOrder = new Order(this);
        orders.add(newOrder);
        System.out.println(name + " placed a new order (Order ID: " + newOrder.getOrderId() + ")");
        return newOrder;
    }

    public void showOrders() {
        System.out.println("Orders for " + name + ":");
        for (Order o : orders) {
            o.showOrderDetails();
            System.out.println();
        }
    }
}

public class ECommerce {
    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 800);
        Product p2 = new Product("Smartphone", 500);
        Product p3 = new Product("Headphones", 50);
        Product p4 = new Product("Keyboard", 30);

        User u1 = new User("Ramesh");
        User u2 = new User("Anita");

        Order order1 = u1.placeOrder();
        order1.addProduct(p1);
        order1.addProduct(p4);

        Order order2 = u1.placeOrder();
        order2.addProduct(p2);

        Order order3 = u2.placeOrder();
        order3.addProduct(p3);
        order3.addProduct(p2);

        System.out.println();
        u1.showOrders();
        u2.showOrders();
    }
}
