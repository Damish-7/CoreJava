package com.xworkz.inter.external;

import com.xworkz.inter.internal.rules.Fan;

public class CeilingFan implements Fan {
    @Override
    public void turnOn() {
        System.out.println("Fan turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan turned off");
    }

    @Override
    public void increaseSpeed() {
        System.out.println("Increasing fan speed");
    }

    @Override
    public void decreaseSpeed() {
        System.out.println("Decreasing fan speed");
    }

    @Override
    public void oscillate() {
        System.out.println("Oscillation enabled");
    }

    @Override
    public void reverseRotation() {
        System.out.println("Reversing fan rotation");
    }

    @Override
    public void cleanBlades() {
        System.out.println("Cleaning fan blades");
    }

    @Override
    public void setTimer() {
        System.out.println("Timer set for fan");
    }

    @Override
    public void changeMode() {
        System.out.println("Changing fan mode");
    }
}
