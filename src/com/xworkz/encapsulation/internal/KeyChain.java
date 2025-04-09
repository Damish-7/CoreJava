package com.xworkz.encapsulation.internal;

public class KeyChain {
    private String material;
    private int keysCount;
    private String color;
    private boolean hasTorch;
    private double weight;

    // Setters (package-private)
    void setMaterial(String material) { this.material = material; }
    void setKeysCount(int keysCount) { this.keysCount = keysCount; }
    void setColor(String color) { this.color = color; }
    void setHasTorch(boolean hasTorch) { this.hasTorch = hasTorch; }
    void setWeight(double weight) { this.weight = weight; }

    // Getters (public)
    public String getMaterial() { return material; }
    public int getKeysCount() { return keysCount; }
    public String getColor() { return color; }
    public boolean isHasTorch() { return hasTorch; }
    public double getWeight() { return weight; }

    public void shake() {
        System.out.println("The " + color + " keychain rattles with " + keysCount + " keys.");
    }
}

