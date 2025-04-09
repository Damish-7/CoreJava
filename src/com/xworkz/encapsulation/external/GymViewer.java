package com.xworkz.encapsulation.external;
import com.xworkz.encapsulation.internal.Gym;
public class GymViewer {
    public void display() {
        Gym gym = new Gym();
        System.out.println("Gym Info (read-only):");
        System.out.println("Name: " + gym.getName());
        System.out.println("Location: " + gym.getLocation());
    }
}
