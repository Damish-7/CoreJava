package com.xworkz.overrided.internal;

public class RollerCoaster extends Attraction {
    public RollerCoaster() {
        System.out.println("Roller coaster is getting ready");
    }

    @Override
    public void startRide() {
        System.out.println("Launching roller coaster ride at high speed");
    }

    public void performLoop() {
        System.out.println("Executing loop-de-loop on the track");
    }
}
