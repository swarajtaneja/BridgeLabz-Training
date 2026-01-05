package com.swiftcart;

public class ProductMain {
    public static void main(String[] args) {

        Product milk = new PerishableProduct("Milk", 3.0);
        Product rice = new NonPerishableProduct("Rice", 10.0);

        Cart cart = new Cart();
        cart.addProduct(milk, 2);  // price * quantity
        cart.addProduct(rice, 1);

        cart.applyDiscount(2.0);   // coupon discount
        cart.generateBill();
    }
}
