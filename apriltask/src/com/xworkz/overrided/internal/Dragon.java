package com.xworkz.overrided.internal;

public class Dragon extends Creature {
    public Dragon() {
        System.out.println("A mighty dragon awakens");
    }

    @Override
    public void makeSound() {
        System.out.println("Dragon roars fiercely");
    }

    public void breatheFire() {
        System.out.println("Dragon breathes fire across the sky");
    }
}
