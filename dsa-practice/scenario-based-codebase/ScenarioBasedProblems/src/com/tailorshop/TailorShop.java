package com.tailorshop;
import java.time.LocalDate;
import java.util.ArrayList;

public class TailorShop {

    public static void insertionSort(ArrayList<Order> orders) {
        for (int i = 1; i < orders.size(); i++) {
            Order key = orders.get(i);
            int j = i - 1;

            while (j >= 0 && orders.get(j).deliveryDate.isAfter(key.deliveryDate)) {
                orders.set(j + 1, orders.get(j));
                j--;
            }
            orders.set(j + 1, key);
        }
    }

    public static void main(String[] args) {

        ArrayList<Order> orders = new ArrayList<>();

        orders.add(new Order(101, "Ravi", LocalDate.of(2026, 1, 25)));
        orders.add(new Order(102, "Meena", LocalDate.of(2026, 1, 28)));
        orders.add(new Order(103, "Arjun", LocalDate.of(2026, 2, 2)));

        orders.add(new Order(104, "Kavya", LocalDate.of(2026, 1, 27)));

        insertionSort(orders);

        System.out.println("📦 TailorShop Order Schedule:");
        for (Order o : orders) {
            System.out.println(
                "Order #" + o.orderId + " | " +
                o.customerName + " | Delivery: " + o.deliveryDate
            );
        }
    }
}
