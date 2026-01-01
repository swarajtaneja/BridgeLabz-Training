package com.bridgelabz.oops.inheritance.singleInheritance.smartHomeDevice;

public class DeviceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Device t1 = new Thermostat(101,"active",24);
		Device t2 = new Thermostat(102,"inactice",16);
		
		t1.displayInfo();
		System.out.println();
		t2.displayInfo();

	}

}
