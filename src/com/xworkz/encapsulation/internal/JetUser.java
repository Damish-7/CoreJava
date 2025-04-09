package com.xworkz.encapsulation.internal;

public class JetUser {
    public void test() {
        Jet jet = new Jet();
        jet.setModel("F-22 Raptor");
        jet.setManufacturer("Lockheed Martin");
        jet.setSpeed(2410);
        jet.setMilitaryUse(true);
        jet.setRange(2960.0);

        System.out.println("Jet Model: " + jet.getModel());
        System.out.println("Manufacturer: " + jet.getManufacturer());
        System.out.println("Military Use? " + jet.isMilitaryUse());

        jet.fly();
    }

}
