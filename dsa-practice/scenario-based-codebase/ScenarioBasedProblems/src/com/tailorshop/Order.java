package com.tailorshop;

import java.time.LocalDate;

public class Order {
    int orderId;
    String customerName;
    LocalDate deliveryDate;

    public Order(int orderId, String customerName, LocalDate deliveryDate) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.deliveryDate = deliveryDate;
    }
}
