package com.warehouse;

import java.time.LocalDate;

public class Medicine {
    String medicineName;
    String batchNo;
    LocalDate expiryDate;

    public Medicine(String medicineName, String batchNo, LocalDate expiryDate) {
        this.medicineName = medicineName;
        this.batchNo = batchNo;
        this.expiryDate = expiryDate;
    }
}
