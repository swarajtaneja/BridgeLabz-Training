package com.ewalletapplication;

import java.time.LocalDateTime;

public class Transaction {
    private String fromUser;
    private String toUser;
    private double amount;
    private LocalDateTime time;

    public Transaction(String fromUser, String toUser, double amount) {
        this.fromUser = fromUser;
        this.toUser = toUser;
        this.amount = amount;
        this.time = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return fromUser + " -> " + toUser + " : $" + amount + " at " + time;
    }
}
