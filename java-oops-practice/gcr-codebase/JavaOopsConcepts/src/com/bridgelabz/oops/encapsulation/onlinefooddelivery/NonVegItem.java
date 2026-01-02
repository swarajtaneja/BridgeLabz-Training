package com.bridgelabz.oops.encapsulation.onlinefooddelivery;

public class NonVegItem extends FoodItem implements Discountable {

    private static final double NON_VEG_CHARGE = 50.0;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + NON_VEG_CHARGE;
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05; // 5% discount
    }

    @Override
    public void getDiscountDetails() {
        System.out.println("Non-Veg Item Discount: 5%");
    }
}
