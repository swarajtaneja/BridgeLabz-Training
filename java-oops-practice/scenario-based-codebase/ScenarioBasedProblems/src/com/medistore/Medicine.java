package com.medistore;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Medicine implements ISellable {
    private String name;
    private double price;        // sensitive, keep private
    private LocalDate expiryDate;
    private int quantity;

    // Constructor with default quantity = 0
    public Medicine(String name, double price, LocalDate expiryDate) {
        this(name, price, expiryDate, 0);
    }

    public Medicine(String name, double price, LocalDate expiryDate, int quantity) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    // Getters
    public String getName() { return name; }
    public LocalDate getExpiryDate() { return expiryDate; }
    public int getQuantity() { return quantity; }

    // Total price calculation
    public double getTotalPrice() {
        return price * quantity;
    }

    // Discount calculation (sensitive logic, private)
    private double calculateDiscount(double percent) {
        return price * (percent / 100);
    }

    // Adjust stock
    public void addStock(int amount) {
        if (amount > 0) {
            quantity += amount;
        }
    }

    public void reduceStock(int amount) {
        if (amount > 0 && quantity >= amount) {
            quantity -= amount;
        } else {
            System.out.println("Insufficient stock to reduce.");
        }
    }

    // Sell implementation
    @Override
    public void sell(int qty) {
        if (qty > 0 && quantity >= qty) {
            quantity -= qty;
            double total = price * qty;
            System.out.println(qty + " units of " + name + " sold. Total: $" + total);
        } else {
            System.out.println("Not enough stock to sell " + qty + " units.");
        }
    }

    // Abstract expiry check (to implement polymorphically)
    @Override
    public abstract boolean checkExpiry();
}
