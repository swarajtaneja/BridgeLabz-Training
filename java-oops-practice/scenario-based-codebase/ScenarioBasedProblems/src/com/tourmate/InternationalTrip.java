package com.tourmate;

public class InternationalTrip extends Trip {

    public InternationalTrip(String destination, int duration,
                             Transport transport, Hotel hotel, Activity activity) {
        super(destination, duration, transport, hotel, activity);
    }

    @Override
    public void bookTrip() {
        System.out.println("Booking International Trip to " + destination);
        System.out.println("Visa and passport verification required.");
        transport.book();
        hotel.book();
        activity.book();
        System.out.println("Total Budget: " + budget);
    }
}
