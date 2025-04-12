package com.xworkz.overrided.internal;

public class Rocket extends Spacecraft {
    public Rocket() {
        System.out.println("Rocket is fueled and ready");
    }

    @Override
    public void launch() {
        System.out.println("Rocket launches with powerful boosters");
    }

    public void deploySatellite() {
        System.out.println("Rocket is deploying a satellite into orbit");
    }
}
