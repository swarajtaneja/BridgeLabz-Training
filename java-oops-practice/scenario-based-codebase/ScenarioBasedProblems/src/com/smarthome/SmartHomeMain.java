package com.smarthome;

public class SmartHomeMain {
	    public static void main(String[] args) {
	        // Create appliances
	        Light livingRoomLight = new Light(60);
	        Fan bedroomFan = new Fan(75);
	        AC officeAC = new AC(1500);

	        // Create controller
	        UserController controller = new UserController();

	        // Toggle appliances
	        controller.toggleAppliance(livingRoomLight, true);
	        controller.toggleAppliance(bedroomFan, true);
	        controller.toggleAppliance(officeAC, true);

	        System.out.println();

	        // Compare energy usage
	        controller.compareEnergy(livingRoomLight, bedroomFan);
	        controller.compareEnergy(officeAC, livingRoomLight);

	        System.out.println();

	        // Turn some devices off
	        controller.toggleAppliance(livingRoomLight, false);
	        controller.toggleAppliance(officeAC, false);
	    }
	}
