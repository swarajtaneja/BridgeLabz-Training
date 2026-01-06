package com.eventease;

public class BirthdayEvent extends Event {

    public BirthdayEvent(String eventName, String location, String date,
                          int attendees, double venueCost,
                          double serviceCost, User organizer) {

        super(eventName, location, date, attendees, venueCost,
              serviceCost, 0, organizer);
    }

    @Override
    public void schedule() {
        System.out.println("Birthday party scheduled on " + date +
                " with fun decorations 🎉");
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Birthday party rescheduled to " + date);
    }

    @Override
    public void cancel() {
        System.out.println("Birthday party cancelled.");
    }
}
