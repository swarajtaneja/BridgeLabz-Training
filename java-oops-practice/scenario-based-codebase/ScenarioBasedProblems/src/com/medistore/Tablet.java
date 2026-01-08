package com.medistore;

import java.time.LocalDate;

public class Tablet extends Medicine {
    public Tablet(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    public Tablet(String name, double price, LocalDate expiryDate, int quantity) {
        super(name, price, expiryDate, quantity);
    }

    @Override
    public boolean checkExpiry() {
        // Tablets are solid, expiry is strict
        if (getExpiryDate().isBefore(LocalDate.now())) {
            System.out.println(getName() + " has expired!");
            return true;
        } else {
            System.out.println(getName() + " is safe to use.");
            return false;
        }
    }
}
