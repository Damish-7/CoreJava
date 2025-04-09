package com.xworkz.encapsulation.internal;

public class ApartmentUser {
    public void test() {
        Apartment apartment = new Apartment();
        apartment.setName("SkyHeights");
        apartment.setLocation("Midtown");
        apartment.setFloors(15);
        apartment.setHasLift(true);
        apartment.setRent(18000.0);

        System.out.println("Apartment Name: " + apartment.getName());
        System.out.println("Location: " + apartment.getLocation());
        System.out.println("Has Lift? " + apartment.hasLift());

        apartment.stay();
    }
}
