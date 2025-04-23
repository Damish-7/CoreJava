package com.xworkz.inter.external;

import com.xworkz.inter.internal.rules.Fridge;

public class DoubleDoorFridge implements Fridge {
    @Override
    public void openDoor() {
        System.out.println("Fridge door opened");
    }

    @Override
    public void coolItems() {
        System.out.println("Cooling food items");
    }

    @Override
    public void closeDoor() {
        System.out.println("Fridge door closed");
    }
}
