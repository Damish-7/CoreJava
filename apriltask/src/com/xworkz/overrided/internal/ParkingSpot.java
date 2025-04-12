package com.xworkz.overrided.internal;

public class ParkingSpot {
    public ParkingSpot() {
        System.out.println("Parking spot system initialized");
    }

    public void parkCar() {
        System.out.println("Parking car in available spot");
    }

    public void freeSpot() {
        System.out.println("Spot is now available for next vehicle");
    }
}
