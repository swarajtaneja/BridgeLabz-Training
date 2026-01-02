package com.bridgelabz.oops.encapsulation.onlinefooddelivery;

public class Order {
    private int orderId;
    private FoodItem foodItem;

    public Order(int orderId, FoodItem foodItem) {
        this.orderId = orderId;
        this.foodItem = foodItem;
    }

    // No direct modification of foodItem allowed
    public void processOrder() {
        foodItem.getItemDetails();
        double total = foodItem.calculateTotalPrice();
        System.out.println("Total Price: " + total);
    }
}
