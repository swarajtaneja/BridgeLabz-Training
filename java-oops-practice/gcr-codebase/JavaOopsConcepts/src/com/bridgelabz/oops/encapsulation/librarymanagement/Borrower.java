package com.bridgelabz.oops.encapsulation.librarymanagement;

public class Borrower {
    private String name;
    private String contactNumber;

    public Borrower(String name, String contactNumber) {
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    // Sensitive data controlled via methods
    public void updateContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
