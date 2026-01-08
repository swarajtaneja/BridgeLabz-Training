package com.medistore;

import java.time.LocalDate;

public class Injection extends Medicine {
    public Injection(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    public Injection(String name, double price, LocalDate expiryDate, int quantity) {
        super(name, price, expiryDate, quantity);
    }

    @Override
    public boolean checkExpiry() {
        // Preserved injections have strict expiry
        if (getExpiryDate().isBefore(LocalDate.now())) {
            System.out.println(getName() + " has expired!");
            return true;
        } else {
            System.out.println(getName() + " is safe to use.");
            return false;
        }
    }
}
