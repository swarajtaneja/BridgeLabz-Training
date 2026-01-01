package com.bridgelabz.oops.inheritance.singleInheritance.smartHomeDevice;

public class Thermostat extends Device {
	private int temperatureSetting;
	public Thermostat(int deviceId,String status,int temperatureSetting) {
		super(deviceId,status);
		this.temperatureSetting = temperatureSetting;
		
	}
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Temperature : "+ temperatureSetting);
	}

}
