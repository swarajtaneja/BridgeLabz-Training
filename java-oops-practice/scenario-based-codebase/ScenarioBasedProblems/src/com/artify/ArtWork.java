package com.artify;

public abstract class ArtWork implements IPurchasable{
	private String title;
	private String artist;
	protected double price;
	protected String licenseType;
	
	//without preview
	public ArtWork(String title, String artist, double price, String licenseType) {
		this.title=title;
		this.artist=artist;
		this.price=price;
		this.licenseType=licenseType;
	}
	//with preview
	public ArtWork(String title, String artist, double price, String licenseType, boolean hasPreview) {
		this(title, artist, price, licenseType);
		if(hasPreview) {
			System.out.println("Preview available : "+title);
		}
	}
	public double getPrice() {
		return price ;
		}
	public String getTitle() {
		return title;
	}
	
}
