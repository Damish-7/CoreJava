package com.xworkz.overrided.internal;

public class Football extends sport {
    public Football() {
        System.out.println("Football match is starting");
    }

    @Override
    public void play() {
        System.out.println("Playing football, passing, and shooting goals");
    }

    public void scoreGoal() {
        System.out.println("Goal! The ball is in the net");
    }
}
