package com.xworkz.encapsulation.internal;

public class Garage {
    private String name;
    private String location;
    private int mechanics;
    private boolean open24Hours;
    private double area;

    // Setters (package-private)
    void setName(String name) { this.name = name; }
    void setLocation(String location) { this.location = location; }
    void setMechanics(int mechanics) { this.mechanics = mechanics; }
    void setOpen24Hours(boolean open24Hours) { this.open24Hours = open24Hours; }
    void setArea(double area) { this.area = area; }

    // Getters (public)
    public String getName() { return name; }
    public String getLocation() { return location; }
    public int getMechanics() { return mechanics; }
    public boolean isOpen24Hours() { return open24Hours; }
    public double getArea() { return area; }

    public void repair() {
        System.out.println("Garage " + name + " is repairing a vehicle.");
    }
}
