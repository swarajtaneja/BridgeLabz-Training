package com.bridgelabz.oops.encapsulation.librarymanagement;

public class LibraryItemMain {
    public static void main(String[] args) {

        LibraryItem item1 = new Book(1, "Java Programming", "James Gosling");
        LibraryItem item2 = new Magazine(2, "Tech Today", "Editorial Team");
        LibraryItem item3 = new DVD(3, "Inception", "Christopher Nolan");

        item1.getItemDetails();
        System.out.println("Loan Duration: " + item1.getLoanDuration() + " days\n");

        item2.getItemDetails();
        System.out.println("Loan Duration: " + item2.getLoanDuration() + " days\n");

        item3.getItemDetails();
        System.out.println("Loan Duration: " + item3.getLoanDuration() + " days\n");

        // Polymorphism with interface
        Reservable r = (Reservable) item1;
        r.reserveItem();
    }
}
