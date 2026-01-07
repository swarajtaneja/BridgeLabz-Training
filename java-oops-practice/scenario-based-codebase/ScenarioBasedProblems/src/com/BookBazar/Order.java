package com.BookBazar;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private String userName;
    private List<Book> books;
    private List<Integer> quantities;
    private OrderStatus status;

    public Order(String userName) {
        this.userName = userName;
        this.books = new ArrayList<>();
        this.quantities = new ArrayList<>();
        this.status = OrderStatus.CREATED;
    }

    public void addBook(Book book, int quantity) {
        if (book.reduceStock(quantity)) {
            books.add(book);
            quantities.add(quantity);
        } else {
            System.out.println("Insufficient stock for " + book.getTitle());
        }
    }

    public double calculateTotalCost() {
        double total = 0;

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            int qty = quantities.get(i);

            double discount = book.applyDiscount(qty);
            total += (book.getPrice() * qty) - discount;
        }
        return total;
    }

    // Status change restricted internally
    protected void updateStatus(OrderStatus status) {
        this.status = status;
    }

    public OrderStatus getStatus() {
        return status;
    }
}
