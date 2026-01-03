package com.ewalletapplication;

import java.util.ArrayList;
import java.util.List;

public abstract class Wallet implements Transferrable {

    private double balance; // encapsulated
    protected List<Transaction> transactions = new ArrayList<>();

    // Constructor with optional referral bonus
    public Wallet(double initialBalance, boolean referral) {
        this.balance = initialBalance;
        if (referral) {
            this.balance += 50; // referral bonus
        }
    }

    public double getBalance() {
        return balance;
    }

    protected void addBalance(double amount) {
        balance += amount;
    }

    protected boolean deductBalance(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public List<Transaction> getTransactionHistory() {
        return transactions;
    }
}
