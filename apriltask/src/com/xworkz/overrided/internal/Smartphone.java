package com.xworkz.overrided.internal;

public class Smartphone extends Device {
    public Smartphone() {
        System.out.println("Smartphone is ready to use");
    }

    @Override
    public void turnOn() {
        System.out.println("Smartphone is powering up with a beautiful display");
    }

    public void useApp() {
        System.out.println("Using an app on the smartphone");
    }
}
