package com.xworkz.overrided.internal;

public class PremiumParkingSpot extends ParkingSpot {
    public PremiumParkingSpot() {
        System.out.println("Premium parking spot ready for use");
    }

    @Override
    public void parkCar() {
        System.out.println("Parking car in premium spot with extra amenities");
    }

    public void addChargingStation() {
        System.out.println("Charging station added to premium parking spot");
    }
}
