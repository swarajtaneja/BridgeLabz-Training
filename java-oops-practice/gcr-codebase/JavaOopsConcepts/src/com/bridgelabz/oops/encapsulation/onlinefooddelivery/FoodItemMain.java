package com.bridgelabz.oops.encapsulation.onlinefooddelivery;

public class FoodItemMain {
    public static void main(String[] args) {

        FoodItem item1 = new VegItem("Paneer Pizza", 250, 2);
        FoodItem item2 = new NonVegItem("Chicken Burger", 180, 1);

        Order order1 = new Order(101, item1);
        Order order2 = new Order(102, item2);

        order1.processOrder();
        System.out.println();

        order2.processOrder();
        System.out.println();

        // Interface polymorphism
        Discountable d = (Discountable) item1;
        d.getDiscountDetails();
        System.out.println("Discount Amount: " + d.applyDiscount());
    }
}
