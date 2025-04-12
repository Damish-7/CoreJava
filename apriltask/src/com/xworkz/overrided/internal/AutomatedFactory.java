package com.xworkz.overrided.internal;

public class AutomatedFactory extends Factory {
    public AutomatedFactory() {
        System.out.println("Automated production system activated");
    }

    @Override
    public void startProduction() {
        System.out.println("Starting automated assembly line production");
    }

    public void scheduleMaintenance() {
        System.out.println("Scheduling system maintenance for the automated machines");
    }
}