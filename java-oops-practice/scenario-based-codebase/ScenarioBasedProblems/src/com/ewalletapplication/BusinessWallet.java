package com.ewalletapplication;

public class BusinessWallet extends Wallet {

    private static final double TAX_RATE = 0.02; // 2% tax

    public BusinessWallet(double initialBalance, boolean referral) {
        super(initialBalance, referral);
    }

    @Override
    public void transferTo(User receiver, double amount) {
        double tax = amount * TAX_RATE;
        double total = amount + tax;

        if (deductBalance(total)) {
            receiver.getWallet().addBalance(amount);
            transactions.add(new Transaction("Business", receiver.getName(), amount));
            System.out.println("Business transfer successful. Tax: $" + tax);
        } else {
            System.out.println("Insufficient balance for business transfer.");
        }
    }
}
