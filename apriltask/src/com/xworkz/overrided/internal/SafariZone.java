package com.xworkz.overrided.internal;

public class SafariZone extends Zoo {
    public SafariZone() {
        System.out.println("Safari Zone is ready for adventure");
    }

    @Override
    public void feedAnimals() {
        System.out.println("Feeding animals in the open safari zone");
    }

    public void startRide() {
        System.out.println("Starting a guided safari ride");
    }
}
