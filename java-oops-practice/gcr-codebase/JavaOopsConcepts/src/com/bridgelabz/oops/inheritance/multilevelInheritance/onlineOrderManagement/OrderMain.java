package com.bridgelabz.oops.inheritance.multilevelInheritance.onlineOrderManagement;

public class OrderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order=new Order("1421","01-01-2026");
		System.out.println(order.getOrderStatus());
		ShippedOrder shipped=new ShippedOrder("1421","01-01-2026",987654);
		System.out.println(shipped.getOrderStatus());
		DeliveredOrder delivered=new DeliveredOrder("1421","01-01-2026",987654,"05-01-2026");
		System.out.println(delivered.getOrderStatus());
		

	}

}
