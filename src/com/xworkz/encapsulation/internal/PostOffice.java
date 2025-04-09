package com.xworkz.encapsulation.internal;

public class PostOffice {
    private String location;
    private String headPostmaster;
    private int employees;
    private boolean isOpen;
    private double area;

    // Setters (package-private)
    void setLocation(String location) { this.location = location; }
    void setHeadPostmaster(String headPostmaster) { this.headPostmaster = headPostmaster; }
    void setEmployees(int employees) { this.employees = employees; }
    void setIsOpen(boolean isOpen) { this.isOpen = isOpen; }
    void setArea(double area) { this.area = area; }

    // Getters (public)
    public String getLocation() { return location; }
    public String getHeadPostmaster() { return headPostmaster; }
    public int getEmployees() { return employees; }
    public boolean isOpen() { return isOpen; }
    public double getArea() { return area; }

    public void dispatch() {
        System.out.println("Mail dispatched from " + location + " post office.");
    }
}
