package com.mybank;

abstract class Account implements ITransaction {

    protected String accountNumber;   // accessible to subclasses
    private double balance;            // encapsulated

    // Constructor without opening balance
    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    // Constructor with opening balance
    public Account(String accountNumber, double openingBalance) {
        this.accountNumber = accountNumber;
        this.balance = openingBalance;
    }

    // Encapsulation: balance modified only via methods
    protected double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    // Polymorphic method
    public abstract double calculateInterest();
}
