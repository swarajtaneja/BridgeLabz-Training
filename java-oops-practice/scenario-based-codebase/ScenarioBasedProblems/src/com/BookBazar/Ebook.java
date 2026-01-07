package com.BookBazar;

public class Ebook extends Book {

    public Ebook(String title, String author, double price) {
        super(title, author, price, Integer.MAX_VALUE); // unlimited stock
    }

    @Override
    public double applyDiscount(int quantity) {
        // Flat 10% discount on eBooks
        return price * quantity * 0.10;
    }
}
