package com.xworkz.overrided.internal;

public class AnimalTracker extends Tracker {
    public AnimalTracker() {
        System.out.println("Animal tracking module activated");
    }

    @Override
    public void track() {
        System.out.println("Tracking animal movement through GPS collar");
    }

    public void analyzeBehavior() {
        System.out.println("Analyzing animal behavior patterns");
    }
}
