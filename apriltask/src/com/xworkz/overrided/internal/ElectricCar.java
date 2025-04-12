package com.xworkz.overrided.internal;

public class ElectricCar extends Vehicle {
    public ElectricCar() {
        System.out.println("ElectricCar is being created");
    }

    @Override
    public void startEngine() {
        System.out.println("Engine started - electric car is silent");
    }

    public void chargeBattery() {
        System.out.println("Electric car battery is charging");
    }
}
