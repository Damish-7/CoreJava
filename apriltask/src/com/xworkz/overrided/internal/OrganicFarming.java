package com.xworkz.overrided.internal;

public class OrganicFarming extends Agriculture {
    public OrganicFarming() {
        System.out.println("Organic farming is being set up");
    }

    @Override
    public void cultivate() {
        System.out.println("Cultivating crops using organic practices");
    }

    public void compost() {
        System.out.println("Preparing compost using natural waste");
    }
}
