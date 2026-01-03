package com.hospitalmanagementsystem;

public class HospitalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Doctor doctor = new Doctor("Dr. Sharma", 303, "Cardiology");

        Patient p1 = new InPatient(101, "Sharma", 50, 5, 1200);
        Patient p2 = new OutPatient(102, "Swaraj", 32, 500);

        // polymorphism
        p1.displayInfo();
        System.out.println();
        p2.displayInfo();

        System.out.println("\nDoctor Details:");
        doctor.displayInfo();

        // billing
        Bill bill1 = new Bill(((InPatient) p1).getTreatmentCost());
        Bill bill2 = new Bill(((OutPatient) p2).getTreatmentCost());

        System.out.println("\nFinal Bills:");
        System.out.println("In-Patient Bill: ₹" + bill1.calculatePayment());
        System.out.println("Out-Patient Bill: ₹" + bill2.calculatePayment());
	}

}
