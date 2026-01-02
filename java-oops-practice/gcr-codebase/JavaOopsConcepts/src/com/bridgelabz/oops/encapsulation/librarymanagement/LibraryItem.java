package com.bridgelabz.oops.encapsulation.librarymanagement;

public abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;
    protected boolean isAvailable = true;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Abstract method
    public abstract int getLoanDuration();

    // Concrete method
    public void getItemDetails() {
        System.out.println("ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + isAvailable);
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}

