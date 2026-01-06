package com.eventease;

import java.util.UUID;

public abstract class Event implements ISchedulable {

    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    // eventId should not be editable once assigned
    private final String eventId;

    // Pricing data must be protected
    private double venueCost;
    private double serviceCost;
    private double discount;

    protected User organizer;

    // Constructor without services
    public Event(String eventName, String location, String date,
                 int attendees, double venueCost, User organizer) {

        this(eventName, location, date, attendees, venueCost, 0, 0, organizer);
    }

    // Constructor with catering / decoration services
    public Event(String eventName, String location, String date,
                 int attendees, double venueCost,
                 double serviceCost, double discount, User organizer) {

        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.venueCost = venueCost;
        this.serviceCost = serviceCost;
        this.discount = discount;
        this.organizer = organizer;

        this.eventId = UUID.randomUUID().toString();
    }

    // No setter for eventId
    public String getEventId() {
        return eventId;
    }

    // Operator usage: cost calculation
    public double calculateTotalCost() {
        return venueCost + serviceCost - discount;
    }
}
	