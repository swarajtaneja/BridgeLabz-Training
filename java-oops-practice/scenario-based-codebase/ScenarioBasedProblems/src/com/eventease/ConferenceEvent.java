package com.eventease;

public class ConferenceEvent extends Event {

    public ConferenceEvent(String eventName, String location, String date,
                           int attendees, double venueCost,
                           double serviceCost, double discount,
                           User organizer) {

        super(eventName, location, date, attendees,
              venueCost, serviceCost, discount, organizer);
    }

    @Override
    public void schedule() {
        System.out.println("Conference scheduled with professional setup 📊");
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Conference rescheduled to " + date);
    }

    @Override
    public void cancel() {
        System.out.println("Conference event cancelled.");
    }
}
