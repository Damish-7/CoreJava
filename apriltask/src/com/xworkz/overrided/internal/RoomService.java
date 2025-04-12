package com.xworkz.overrided.internal;

public class RoomService {
    public RoomService() {
        System.out.println("Room service is now available");
    }

    public void requestService() {
        System.out.println("Requesting standard room service");
    }

    public void cancelService() {
        System.out.println("Cancelling the requested service");
    }
}

