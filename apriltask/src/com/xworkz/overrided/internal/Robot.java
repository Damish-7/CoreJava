package com.xworkz.overrided.internal;

public class Robot extends Machine {
    public Robot() {
        System.out.println("Robot is activated");
    }

    @Override
    public void start() {
        System.out.println("Robot starting with AI...");
    }

    public void scan() {
        System.out.println("Robot is scanning...");
    }
}
