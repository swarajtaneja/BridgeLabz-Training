package com.medistore;

import java.time.LocalDate;

public class Syrup extends Medicine {
    public Syrup(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    public Syrup(String name, double price, LocalDate expiryDate, int quantity) {
        super(name, price, expiryDate, quantity);
    }

    @Override
    public boolean checkExpiry() {
        // Liquids can be used slightly after expiry (1 week grace)
        LocalDate now = LocalDate.now();
        if (getExpiryDate().isBefore(now.minusDays(7))) {
            System.out.println(getName() + " has expired!");
            return true;
        } else {
            System.out.println(getName() + " is safe to use.");
            return false;
        }
    }
}
