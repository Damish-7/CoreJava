package com.xworkz.overrided.internal;

public class Guitar extends Instrument {
    public Guitar() {
        System.out.println("Guitar is tuned and ready to play");
    }

    @Override
    public void play() {
        System.out.println("Strumming the guitar strings");
    }

    public void playSolo() {
        System.out.println("Playing an epic guitar solo");
    }
}
