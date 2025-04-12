package com.xworkz.overrided.internal;

public class LuxuryService extends RoomService {
    public LuxuryService() {
        System.out.println("Luxury room service initialized");
    }

    @Override
    public void requestService() {
        System.out.println("Requesting luxury-level room service");
    }

    public void serveChampagne() {
        System.out.println("Serving complimentary champagne");
    }
}
