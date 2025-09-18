package Encapsulation;

import java.util.ArrayList;
import java.util.List;

abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateDiscount();
    public void displayDetails() {
        System.out.println("Product ID : " + productId);
        System.out.println("Name       : " + name);
        System.out.println("Price      : $" + price);
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

interface Taxable {
    double calculateTax();
    void getTaxDetails();
}

class Electronics extends Product implements Taxable {
    private double taxRate;

    public Electronics(int productId, String name, double price, double taxRate) {
        super(productId, name, price);
        this.taxRate = taxRate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10;
    }

    @Override
    public double calculateTax() {
        return getPrice() * (taxRate / 100);
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Tax Rate  : " + taxRate + "%");
        System.out.printf("Tax Amount: $%.2f%n", calculateTax());
    }
}

class Clothing extends Product implements Taxable {
    private double taxRate;

    public Clothing(int productId, String name, double price, double taxRate) {
        super(productId, name, price);
        this.taxRate = taxRate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20;
    }

    @Override
    public double calculateTax() {
        return getPrice() * (taxRate / 100);
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Tax Rate  : " + taxRate + "%");
        System.out.printf("Tax Amount: $%.2f%n", calculateTax());
    }
}

class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
}

public class ECommercePlatform {

    public static void calculateFinalPrice(Product product) {
        double price = product.getPrice();
        double discount = product.calculateDiscount();
        double tax = 0;

        if (product instanceof Taxable) {
            Taxable taxableProduct = (Taxable) product;
            tax = taxableProduct.calculateTax();
            taxableProduct.getTaxDetails();
        }

        double finalPrice = price + tax - discount;
        System.out.printf("Final Price: $%.2f%n", finalPrice);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        Electronics laptop = new Electronics(101, "Laptop", 1200.0, 15);
        Clothing tshirt = new Clothing(102, "T-Shirt", 50.0, 5);
        Groceries rice = new Groceries(103, "Rice Pack", 30.0);

        products.add(laptop);
        products.add(tshirt);
        products.add(rice);

        System.out.println("=== Product Pricing Details ===\n");

        for (Product product : products) {
            product.displayDetails();
            calculateFinalPrice(product);
        }
    }
}

