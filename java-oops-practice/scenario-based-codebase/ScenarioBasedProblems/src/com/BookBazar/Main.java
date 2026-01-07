package com.BookBazar;

public class Main {

    public static void main(String[] args) {

        Book ebook = new Ebook("Clean Code", "Robert C. Martin", 500);
        Book printedBook = new PrintedBook("Java Basics", "James Gosling", 800, 5);

        Order order = new Order("Amit");

        order.addBook(ebook, 1);
        order.addBook(printedBook, 2);

        System.out.println("Order Status: " + order.getStatus());
        System.out.println("Total Cost: ₹" + order.calculateTotalCost());
    }
}
