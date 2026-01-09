package com.artify;

public class Main {
    public static void main(String[] args) {

        User buyer = new User("Alice", 500.0);

        ArtWork art1 = new DigitalArt("Cyber Dreams", "Liam", 150.0);
        ArtWork art2 = new PrintArt("Nature Bloom", "Emma", 200.0);

        art1.purchase(buyer);
        art1.license();

        art2.purchase(buyer);
        art2.license();

        System.out.println("Remaining Wallet Balance: " + buyer.getWalletBalance());
    }
}
