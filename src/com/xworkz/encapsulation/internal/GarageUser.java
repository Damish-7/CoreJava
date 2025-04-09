package com.xworkz.encapsulation.internal;

public class GarageUser {
    public void test() {
        Garage garage = new Garage();
        garage.setName("SpeedFix");
        garage.setLocation("Uptown");
        garage.setMechanics(8);
        garage.setOpen24Hours(false);
        garage.setArea(550.5);

        System.out.println("Garage Name: " + garage.getName());
        System.out.println("Location: " + garage.getLocation());
        System.out.println("Open 24/7? " + garage.isOpen24Hours());

        garage.repair();
    }
}
