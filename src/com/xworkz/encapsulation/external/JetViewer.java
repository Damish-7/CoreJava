package com.xworkz.encapsulation.external;
import com.xworkz.encapsulation.internal.Jet;
public class JetViewer {
    public void display() {
        Jet jet = new Jet();
        System.out.println("Jet Info (read-only):");
        System.out.println("Model: " + jet.getModel());
        System.out.println("Manufacturer: " + jet.getManufacturer());
    }
}
