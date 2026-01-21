package com.foodfest;

import java.util.ArrayList;

public class FoodFest {

    public static void mergeSort(ArrayList<Stall> stalls) {
        if (stalls.size() <= 1)
            return;

        int mid = stalls.size() / 2;

        ArrayList<Stall> left = new ArrayList<>(stalls.subList(0, mid));
        ArrayList<Stall> right = new ArrayList<>(stalls.subList(mid, stalls.size()));

        mergeSort(left);
        mergeSort(right);

        merge(stalls, left, right);
    }

    private static void merge(ArrayList<Stall> result,
                              ArrayList<Stall> left,
                              ArrayList<Stall> right) {

        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).footfall <= right.get(j).footfall) {
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

        ArrayList<Stall> stalls = new ArrayList<>();

        stalls.add(new Stall("Burger Hub", 120));
        stalls.add(new Stall("Pizza Corner", 150));
        stalls.add(new Stall("Taco Town", 150));  
        stalls.add(new Stall("Sweet Treats", 180));
        stalls.add(new Stall("Spice Villa", 200));

        mergeSort(stalls);

        System.out.println("Master Stall Performance List:");
        for (Stall s : stalls) {
            System.out.println(s.stallName + " - " + s.footfall);
        }
    }
}
