package com.xworkz.encapsulation.external;
import com.xworkz.encapsulation.internal.Apartment;

public class ApartmentViewer {
    public void display() {
        Apartment apartment = new Apartment();
        System.out.println("Apartment Info (read-only):");
        System.out.println("Name: " + apartment.getName());
        System.out.println("Location: " + apartment.getLocation());
    }
}
