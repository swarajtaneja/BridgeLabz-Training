package com.ewalletapplication;

public class UserMain {
    public static void main(String[] args) {

        User alice = new User("Alice",
                new PersonalWallet(1000, true));

        User bob = new User("Bob",
                new BusinessWallet(5000, false));

        alice.getWallet().transferTo(bob, 500);
        bob.getWallet().transferTo(alice, 1000);

        System.out.println("Alice Balance: $" + alice.getWallet().getBalance());
        System.out.println("Bob Balance: $" + bob.getWallet().getBalance());
    }
}
