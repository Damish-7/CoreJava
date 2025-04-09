package com.xworkz.encapsulation.internal;

public class Tank {
    private String model;
    private String country;
    private int capacity;
    private boolean inService;
    private double weight;

    // Setters (package-private)
    void setModel(String model) { this.model = model; }
    void setCountry(String country) { this.country = country; }
    void setCapacity(int capacity) { this.capacity = capacity; }
    void setInService(boolean inService) { this.inService = inService; }
    void setWeight(double weight) { this.weight = weight; }

    // Getters (public)
    public String getModel() { return model; }
    public String getCountry() { return country; }
    public int getCapacity() { return capacity; }
    public boolean isInService() { return inService; }
    public double getWeight() { return weight; }

    public void fire() {
        System.out.println(model + " fired a shell!");
    }
}
