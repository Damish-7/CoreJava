package com.xworkz.overrided.internal;

public class ConferenceRoom extends Room {
    public ConferenceRoom() {
        System.out.println("Conference room system activated");
    }

    @Override
    public void bookRoom() {
        System.out.println("Booking a conference room with equipment");
    }

    public void reserveEquipment() {
        System.out.println("Reserving AV equipment for the conference room");
    }
}
