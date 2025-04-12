package com.xworkz.overrided.internal;

public class Beach extends Destination {
    public Beach() {
        System.out.println("Beach destination has sandy shores and sunny weather");
    }

    @Override
    public void explore() {
        System.out.println("Exploring the beach, enjoying the waves and sand");
    }

    public void swim() {
        System.out.println("Swimming in the crystal-clear water");
    }
}
