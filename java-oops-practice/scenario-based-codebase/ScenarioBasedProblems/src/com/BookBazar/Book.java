package com.BookBazar;

public abstract class Book implements IDiscountable {

    protected String title;
    protected String author;
    protected double price;
    private int stock;   // encapsulated inventory

    // Constructor without offer
    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    // Constructor with optional stock
    public Book(String title, String author, double price) {
        this(title, author, price, 10);
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    // Inventory updates allowed only through methods
    public boolean reduceStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
            return true;
        }
        return false;
    }
}
