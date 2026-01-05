package com.swiftcart;

import java.util.ArrayList;
import java.util.List;

public class Cart implements ICheckout {

    private List<Product> products;
    private double totalPrice;

    // Constructor with no pre-selected items
    public Cart() {
        products = new ArrayList<>();
        totalPrice = 0;
    }

    // Constructor with pre-selected items
    public Cart(List<Product> products) {
        this.products = products;
        calculateTotal();
    }

    public void addProduct(Product product, int quantity) {
        products.add(product);
        updateTotal(product.getPrice(), quantity);
    }

    // price * quantity (operator logic via method)
    private void updateTotal(double price, int quantity) {
        totalPrice += price * quantity;
    }

    // Encapsulation: only Cart can modify totalPrice
    private void calculateTotal() {
        totalPrice = 0;
        for (Product p : products) {
            totalPrice += p.getPrice();
        }
    }

    @Override
    public void applyDiscount(double couponAmount) {
        double productDiscount = 0;

        for (Product p : products) {
            productDiscount += p.getDiscount(); // polymorphism
        }

        // totalPrice - coupon (operator logic via method)
        totalPrice = totalPrice - productDiscount - couponAmount;
    }

    @Override
    public void generateBill() {
        System.out.println("------ SwiftCart Bill ------");
        for (Product p : products) {
            System.out.println(p.getName() + " : $" + p.getPrice());
        }
        System.out.println("Total Payable: $" + totalPrice);
    }
}
