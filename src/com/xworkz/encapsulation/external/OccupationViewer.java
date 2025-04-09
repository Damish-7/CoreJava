package com.xworkz.encapsulation.external;
import com.xworkz.encapsulation.internal.Occupation;
public class OccupationViewer {


    public void display() {
        Occupation occupation = new Occupation();
        System.out.println("Occupation Info (read-only):");
        System.out.println("Title: " + occupation.getTitle());
        System.out.println("Sector: " + occupation.getSector());
    }
}