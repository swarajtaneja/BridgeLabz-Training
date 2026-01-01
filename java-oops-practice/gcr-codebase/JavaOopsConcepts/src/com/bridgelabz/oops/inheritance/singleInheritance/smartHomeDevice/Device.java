package com.bridgelabz.oops.inheritance.singleInheritance.smartHomeDevice;

public class Device {
	private String status;
	private int deviceId;
	public Device(int deviceId,String status) {
		this.deviceId=deviceId;
		this.status=status;
	}
	public void displayInfo() {
		System.out.println("Device ID : "+deviceId);
		System.out.println("Device Status : "+status);
	}

}
