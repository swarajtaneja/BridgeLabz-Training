package com.warehouse;

import java.time.LocalDate;
import java.util.ArrayList;

public class MedWareHouse {

    public static void mergeSort(ArrayList<Medicine> medicines) {
        if (medicines.size() <= 1)
            return;

        int mid = medicines.size() / 2;

        ArrayList<Medicine> left = new ArrayList<>(medicines.subList(0, mid));
        ArrayList<Medicine> right = new ArrayList<>(medicines.subList(mid, medicines.size()));

        mergeSort(left);
        mergeSort(right);

        merge(medicines, left, right);
    }

    private static void merge(ArrayList<Medicine> result,
                              ArrayList<Medicine> left,
                              ArrayList<Medicine> right) {

        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {
            if (!left.get(i).expiryDate.isAfter(right.get(j).expiryDate)) {
                result.set(k++, left.get(i++));
            } else {
                result.set(k++, right.get(j++));
            }
        }

        while (i < left.size())
            result.set(k++, left.get(i++));

        while (j < right.size())
            result.set(k++, right.get(j++));
    }

    public static void main(String[] args) {

        ArrayList<Medicine> medicines = new ArrayList<>();

        medicines.add(new Medicine("Paracetamol", "B101",
                LocalDate.of(2026, 2, 10)));
        medicines.add(new Medicine("profen", "B203",
                LocalDate.of(2026, 3, 5)));
        medicines.add(new Medicine("Cough Syrup", "C311",
                LocalDate.of(2026, 1, 28)));
        medicines.add(new Medicine("Vitamin C Tablet", "V402",
                LocalDate.of(2026, 4, 15)));

        mergeSort(medicines);

        System.out.println("📋 MedWarehouse Expiry List:");
        for (Medicine m : medicines) {
            System.out.println(
                m.medicineName + " | Batch: " + m.batchNo +
                " | Expiry: " + m.expiryDate
            );
        }

        System.out.println("\n⚠️ Near Expiry Alert:");
        LocalDate today = LocalDate.now();

        for (Medicine m : medicines) {
            if (!m.expiryDate.isAfter(today.plusDays(30))) {
                System.out.println(
                    m.medicineName + " (Batch " + m.batchNo +
                    ") expires on " + m.expiryDate
                );
            }
        }
    }
}
