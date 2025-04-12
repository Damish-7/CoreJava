package com.xworkz.overrided.internal;

public class SurveillanceDrone extends Drone {
    public SurveillanceDrone() {
        System.out.println("Surveillance drone ready for mission");
    }

    @Override
    public void fly() {
        System.out.println("Flying drone in autonomous surveillance mode");
    }

    public void captureVideo() {
        System.out.println("Capturing live surveillance video");
    }
}
