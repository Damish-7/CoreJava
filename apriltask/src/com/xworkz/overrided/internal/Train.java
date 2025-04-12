package com.xworkz.overrided.internal;

public class Train extends Transport {
    public Train() {
        System.out.println("Train is set on the railway track");
    }

    @Override
    public void move() {
        System.out.println("Train is moving along the track at high speed");
    }

    public void whistle() {
        System.out.println("Train is whistling before entering the station");
    }
}
