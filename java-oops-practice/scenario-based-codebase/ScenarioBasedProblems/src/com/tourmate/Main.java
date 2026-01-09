package com.tourmate;

public class Main {
    public static void main(String[] args) {

        Transport flight = new Transport(500);
        Hotel hotel = new Hotel(700);
        Activity sightseeing = new Activity(300);

        Trip trip1 = new DomesticTrip("Goa", 5, flight, hotel, sightseeing);
        trip1.bookTrip();

        System.out.println();

        Trip trip2 = new InternationalTrip("Paris", 7, flight, hotel, sightseeing);
        trip2.bookTrip();
    }
}
