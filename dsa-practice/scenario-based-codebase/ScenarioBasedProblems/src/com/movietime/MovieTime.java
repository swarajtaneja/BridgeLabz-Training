package com.movietime;

import java.time.LocalTime;
import java.util.ArrayList;

public class MovieTime {

    public static void insertionSort(ArrayList<ShowTime> shows) {
        for (int i = 1; i < shows.size(); i++) {
            ShowTime key = shows.get(i);
            int j = i - 1;

            while (j >= 0 && shows.get(j).time.isAfter(key.time)) {
                shows.set(j + 1, shows.get(j));
                j--;
            }
            shows.set(j + 1, key);
        }
    }

    public static void main(String[] args) {
        ArrayList<ShowTime> shows = new ArrayList<>();

        shows.add(new ShowTime("Avengers", LocalTime.of(10, 30)));
        shows.add(new ShowTime("Inception", LocalTime.of(12, 45)));
        shows.add(new ShowTime("Interstellar", LocalTime.of(15, 0)));

        shows.add(new ShowTime("Batman", LocalTime.of(11, 15)));

        insertionSort(shows);

        System.out.println("Today's Show Listings:");
        for (ShowTime s : shows) {
            System.out.println(s.movieName + " - " + s.time);
        }
    }
}
