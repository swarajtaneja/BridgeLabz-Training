package com.ewalletapplication;

public class PersonalWallet extends Wallet {

    private static final double TRANSFER_LIMIT = 5000;

    public PersonalWallet(double initialBalance, boolean referral) {
        super(initialBalance, referral);
    }

    @Override
    public void transferTo(User receiver, double amount) {
        if (amount > TRANSFER_LIMIT) {
            System.out.println("Transfer exceeds personal wallet limit.");
            return;
        }

        if (deductBalance(amount)) {
            receiver.getWallet().addBalance(amount);
            transactions.add(new Transaction("Personal", receiver.getName(), amount));
            System.out.println("Personal transfer successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
