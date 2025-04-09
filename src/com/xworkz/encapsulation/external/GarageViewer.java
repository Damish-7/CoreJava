package com.xworkz.encapsulation.external;
import com.xworkz.encapsulation.internal.Garage;
public class GarageViewer {
    public void display() {
        Garage garage = new Garage();
        System.out.println("Garage Info (read-only):");
        System.out.println("Name: " + garage.getName());
        System.out.println("Location: " + garage.getLocation());
    }
}
