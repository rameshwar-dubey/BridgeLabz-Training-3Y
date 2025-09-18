package Encapsulation;

import java.util.ArrayList;
import java.util.List;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item Name : " + itemName);
        System.out.println("Price     : $" + price);
        System.out.println("Quantity  : " + quantity);
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

interface Discountable {
    double applyDiscount();
    void getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    private double discountRate;
    public VegItem(String itemName, double price, int quantity, double discountRate) {
        super(itemName, price, quantity);
        this.discountRate = discountRate;
    }

    @Override
    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        return total - applyDiscount();
    }

    @Override
    public double applyDiscount() {
        return getPrice() * getQuantity() * (discountRate / 100);
    }

    @Override
    public void getDiscountDetails() {
        System.out.printf("Veg Item Discount: $%.2f (%.1f%%)%n", applyDiscount(), discountRate);
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private double extraCharge;
    private double discountRate;

    public NonVegItem(String itemName, double price, int quantity, double extraCharge, double discountRate) {
        super(itemName, price, quantity);
        this.extraCharge = extraCharge;
        this.discountRate = discountRate;
    }

    @Override
    public double calculateTotalPrice() {
        double total = (getPrice() + extraCharge) * getQuantity();
        return total - applyDiscount();
    }

    @Override
    public double applyDiscount() {
        return (getPrice() + extraCharge) * getQuantity() * (discountRate / 100);
    }

    @Override
    public void getDiscountDetails() {
        System.out.printf("Non-Veg Item Discount: $%.2f (%.1f%%) with extra charge $%.2f%n", applyDiscount(), discountRate, extraCharge);
    }
}

public class FoodDelivery {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();

        VegItem paneer = new VegItem("Paneer Curry", 8.0, 2, 10);       // 10% discount
        NonVegItem chicken = new NonVegItem("Chicken Biryani", 12.0, 1, 2.0, 5); // 5% discount + $2 extra

        order.add(paneer);
        order.add(chicken);

        System.out.println("=== Order Details ===\n");
        double grandTotal = 0;

        for (FoodItem item : order) {
            item.getItemDetails();
            if (item instanceof Discountable) {
                Discountable discountableItem = (Discountable) item;
                discountableItem.getDiscountDetails();
            }
            double totalPrice = item.calculateTotalPrice();
            System.out.printf("Total Price: $%.2f%n", totalPrice);
            System.out.println("-------------------------\n");
            grandTotal += totalPrice;
        }

        System.out.printf("Grand Total for Order: $%.2f%n", grandTotal);
    }
}

