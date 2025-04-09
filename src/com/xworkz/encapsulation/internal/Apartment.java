package com.xworkz.encapsulation.internal;

public class Apartment {
    private String name;
    private String location;
    private int floors;
    private boolean hasLift;
    private double rent;

    // Setters (package-private)
    void setName(String name) { this.name = name; }
    void setLocation(String location) { this.location = location; }
    void setFloors(int floors) { this.floors = floors; }
    void setHasLift(boolean hasLift) { this.hasLift = hasLift; }
    void setRent(double rent) { this.rent = rent; }

    // Getters (public)
    public String getName() { return name; }
    public String getLocation() { return location; }
    public int getFloors() { return floors; }
    public boolean hasLift() { return hasLift; }
    public double getRent() { return rent; }

    public void stay() {
        System.out.println("Staying at " + name + " located in " + location + ".");
    }
}
