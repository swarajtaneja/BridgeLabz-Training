package com.bridgelabz.oops.encapsulation.bankingsystem;

public class CurrentAccount extends BankAccount implements Loanable {

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.02; // 2% interest
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan applied for Current Account: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return balance >= 10000;
    }
}
