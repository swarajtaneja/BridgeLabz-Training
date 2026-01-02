package com.bridgelabz.oops.encapsulation.bankingsystem;

import java.util.List;

public class BankService {

    public static void processAccounts(List<BankAccount> accounts) {

        for (BankAccount account : accounts) {

            double interest = account.calculateInterest();

            System.out.println("Account Holder: " + account.getHolderName());
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Calculated Interest: " + interest);
            System.out.println("------------------------------");
        }
    }
}
