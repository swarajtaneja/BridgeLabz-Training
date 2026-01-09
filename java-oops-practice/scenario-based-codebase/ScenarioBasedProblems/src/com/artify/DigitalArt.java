package com.artify;

public class DigitalArt extends ArtWork{
	public DigitalArt(String title, String artist, double price) {
		super(title,artist,price,"License : ",true);
	}
	@Override
	public void purchase(User user) {
		if (user.getWalletBalance() >= price) {
            user.setWalletBalance(user.getWalletBalance() - price);
            System.out.println(user.getName() + " purchased print art: " + getTitle());
        } else {
            System.out.println("Insufficient balance!");
        }
		
	}
	@Override
	public void license() {
		System.out.println("Digital Art License : Personal Use Only");
	}

}
