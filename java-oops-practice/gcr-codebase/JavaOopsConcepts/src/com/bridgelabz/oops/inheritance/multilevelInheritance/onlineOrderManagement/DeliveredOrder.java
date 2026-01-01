package com.bridgelabz.oops.inheritance.multilevelInheritance.onlineOrderManagement;

public class DeliveredOrder extends ShippedOrder {
	private String deliveryDate;
	public DeliveredOrder(String orderId,String orderDate,int trackingNumber,String deliveryDate) {
		super(orderId,orderDate,trackingNumber);
		this.deliveryDate=deliveryDate;
	}
	public String getOrderStatus() {
		return "Order Delivered";
	}

}
