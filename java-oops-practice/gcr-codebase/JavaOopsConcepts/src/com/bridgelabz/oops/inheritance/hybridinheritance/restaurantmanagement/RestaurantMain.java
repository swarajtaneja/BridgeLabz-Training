package com.bridgelabz.oops.inheritance.hybridinheritance.restaurantmanagement;

public class RestaurantMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chef chef = new Chef("kidimba", 101);
        Waiter waiter = new Waiter("sukuna", 201);

        System.out.println("Chef Details");
        chef.displayInfo();
        chef.performDuties();

        System.out.println("\nWaiter Details");
        waiter.displayInfo();
        waiter.performDuties();
	}

}