package com.bridgelabz.oops.inheritance.multilevelInheritance.onlineOrderManagement;

public class ShippedOrder extends Order{
	private int trackingNumber;
	public ShippedOrder(String orderId,String orderDate,int trackingNumber) {
		super(orderId,orderDate);
		this.trackingNumber=trackingNumber;
	}
	public String getOrderStatus() {
		return "Shipped Order";
	}

}
