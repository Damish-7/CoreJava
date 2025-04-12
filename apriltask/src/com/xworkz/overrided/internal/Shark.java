package com.xworkz.overrided.internal;

public class Shark extends SeaCreature {
    public Shark() {
        System.out.println("Shark is hunting in the deep ocean");
    }

    @Override
    public void swim() {
        System.out.println("Shark swims swiftly through the water");
    }

    public void attack() {
        System.out.println("Shark attacks its prey with sharp teeth");
    }
}