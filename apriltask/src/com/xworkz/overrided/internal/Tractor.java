package com.xworkz.overrided.internal;

public class Tractor extends FarmMachine {
    public Tractor() {
        System.out.println("Tractor is ready to plow the field");
    }

    @Override
    public void operate() {
        System.out.println("Tractor is plowing the field");
    }

    public void haul() {
        System.out.println("Tractor is hauling heavy loads");
    }
}
