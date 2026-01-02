package com.bridgelabz.oops.encapsulation.hospitalmanagement;

import java.util.ArrayList;
import java.util.List;

public class OutPatient extends Patient implements MedicalRecord {

    private double consultationFee;
    private List<String> records = new ArrayList<>();

    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Out-Patient Medical Records:");
        for (String record : records) {
            System.out.println("- " + record);
        }
    }
}
