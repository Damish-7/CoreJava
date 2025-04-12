package com.xworkz.overrided.internal;

public class Tracker {
    public Tracker() {
        System.out.println("Initializing base tracking system");
    }

    public void track() {
        System.out.println("Tracking object location");
    }

    public void stopTracking() {
        System.out.println("Stopping tracking activity");
    }
}

