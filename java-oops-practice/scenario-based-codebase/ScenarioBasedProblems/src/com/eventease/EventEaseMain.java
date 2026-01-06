package com.eventease;

public class EventEaseMain {
    public static void main(String[] args) {

        User organizer = new User("Ananya", "ananya@mail.com");

        Event birthday = new BirthdayEvent(
                "Aarav's Birthday", "Banquet Hall",
                "10-May-2026", 50,
                20000, 5000, organizer
        );

        Event conference = new ConferenceEvent(
                "Tech Summit", "Convention Center",
                "20-June-2026", 300,
                100000, 40000, 10000, organizer
        );

        birthday.schedule();
        System.out.println("Birthday Cost: " + birthday.calculateTotalCost());

        conference.schedule();
        System.out.println("Conference Cost: " + conference.calculateTotalCost());
    }
}
