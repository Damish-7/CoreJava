package com.xworkz.inter.external;

import com.xworkz.inter.internal.rules.Monitor;

public class LEDMonitor implements Monitor {
    @Override
    public void turnOn() {
        System.out.println("Monitor turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Monitor turned off");
    }

    @Override
    public void adjustBrightness() {
        System.out.println("Brightness adjusted");
    }

    @Override
    public void switchInput() {
        System.out.println("Input source switched");
    }

    @Override
    public void rotate() {
        System.out.println("Monitor rotated");
    }
}
