package com.bridgelabz.oops.encapsulation.hospitalmanagement;

public class PatientMain {
    public static void main(String[] args) {

        Patient p1 = new InPatient(101, "Amit", 45, 5, 2000);
        Patient p2 = new OutPatient(102, "Neha", 30, 500);

        // Setting medical details (encapsulation)
        p1.setMedicalDetails("Fracture", "No prior complications");
        p2.setMedicalDetails("Fever", "Seasonal illness");

        // Polymorphism in billing
        displayBilling(p1);
        System.out.println();
        displayBilling(p2);

        // Interface usage
        MedicalRecord m1 = (MedicalRecord) p1;
        m1.addRecord("X-Ray performed");
        m1.addRecord("Surgery scheduled");
        m1.viewRecords();
    }

    // Polymorphic method
    public static void displayBilling(Patient patient) {
        patient.getPatientDetails();
        System.out.println("Total Bill: ₹" + patient.calculateBill());
    }
}
