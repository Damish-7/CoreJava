package com.xworkz.encapsulation.internal;

public class Jet {
    private String model;
    private String manufacturer;
    private int speed; // in km/h
    private boolean militaryUse;
    private double range; // in km

    // Setters (package-private)
    void setModel(String model) { this.model = model; }
    void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }
    void setSpeed(int speed) { this.speed = speed; }
    void setMilitaryUse(boolean militaryUse) { this.militaryUse = militaryUse; }
    void setRange(double range) { this.range = range; }

    // Getters (public)
    public String getModel() { return model; }
    public String getManufacturer() { return manufacturer; }
    public int getSpeed() { return speed; }
    public boolean isMilitaryUse() { return militaryUse; }
    public double getRange() { return range; }

    public void fly() {
        System.out.println("Jet " + model + " is flying at " + speed + " km/h.");
    }
}
