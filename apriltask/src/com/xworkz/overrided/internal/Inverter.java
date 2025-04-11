package com.xworkz.overrided.internal;

public class Inverter extends Generator {
    public Inverter() {
        System.out.println("running inverter");
    }

    @Override
    public void motor() {
        System.out.println("motor in inverter");
    }

    public void backup() {
        System.out.println("motor is backup");
    }
}