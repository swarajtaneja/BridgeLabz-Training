package com.medistore;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Tablet paracetamol = new Tablet("Paracetamol", 0.5, LocalDate.of(2026, 3, 15), 100);
        Syrup coughSyrup = new Syrup("Cough Syrup", 3.0, LocalDate.of(2026, 1, 20), 50);
        Injection insulin = new Injection("Insulin", 25.0, LocalDate.of(2025, 12, 31), 20);

        // Selling medicines
        paracetamol.sell(10);
        coughSyrup.sell(5);
        insulin.sell(2);

        // Adjusting stock
        paracetamol.addStock(50);
        insulin.reduceStock(5);

        // Check expiry
        paracetamol.checkExpiry();
        coughSyrup.checkExpiry();
        insulin.checkExpiry();

        // Total price
        System.out.println("Total price of remaining paracetamol: $" + paracetamol.getTotalPrice());
    }
}
