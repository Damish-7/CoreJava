package com.xworkz.encapsulation.external;
import com.xworkz.encapsulation.internal.Tank;
public class TankViewer {
    public void display() {
        Tank tank = new Tank();
        System.out.println("Tank Info (read-only):");
        System.out.println("Model: " + tank.getModel());
        System.out.println("Country: " + tank.getCountry());
    }
}
