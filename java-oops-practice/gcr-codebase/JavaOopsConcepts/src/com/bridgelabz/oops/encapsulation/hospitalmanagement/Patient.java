package com.bridgelabz.oops.encapsulation.hospitalmanagement;

public abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    // Sensitive data (encapsulated)
    private String diagnosis;
    private String medicalHistory;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Abstract method
    public abstract double calculateBill();

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Encapsulation: controlled access to sensitive data
    public void setMedicalDetails(String diagnosis, String medicalHistory) {
        this.diagnosis = diagnosis;
        this.medicalHistory = medicalHistory;
    }

    protected String getDiagnosis() {
        return diagnosis;
    }
}
