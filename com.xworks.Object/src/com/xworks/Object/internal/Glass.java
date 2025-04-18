package com.xworks.Object.internal;

import java.util.Objects;

public class Glass {
    private String material;  // e.g., "Glass", "Plastic"
    private String color;     // e.g., "Clear", "Blue"
    private double capacity;  // in milliliters (ml)
    private boolean isDishwasherSafe;

    public Glass() {
    }

    public void setGlass(String material, String color, double capacity, boolean isDishwasherSafe) {
        this.material = material;
        this.color = color;
        this.capacity = capacity;
        this.isDishwasherSafe = isDishwasherSafe;
    }

    @Override
    public String toString() {
        return "Glass{material='" + material + "', color='" + color + "', capacity=" + capacity + "ml, isDishwasherSafe=" + isDishwasherSafe + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Glass) {
            Glass other = (Glass) obj;
            if (this.material.equals(other.material) && this.capacity == other.capacity) {
                System.out.println("Matching glass material and capacity..");
                return true;
            }
        }
        return false;
    }
}
