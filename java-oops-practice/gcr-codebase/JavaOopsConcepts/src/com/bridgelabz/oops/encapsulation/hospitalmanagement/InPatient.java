package com.bridgelabz.oops.encapsulation.hospitalmanagement;

import java.util.ArrayList;
import java.util.List;

public class InPatient extends Patient implements MedicalRecord {

    private int numberOfDays;
    private double dailyCharge;
    private List<String> records = new ArrayList<>();

    public InPatient(int patientId, String name, int age,
                     int numberOfDays, double dailyCharge) {
        super(patientId, name, age);
        this.numberOfDays = numberOfDays;
        this.dailyCharge = dailyCharge;
    }

    @Override
    public double calculateBill() {
        return numberOfDays * dailyCharge;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("In-Patient Medical Records:");
        for (String record : records) {
            System.out.println("- " + record);
        }
    }
}
