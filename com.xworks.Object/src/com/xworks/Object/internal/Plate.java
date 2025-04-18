package com.xworks.Object.internal;

import java.util.Objects;

public class Plate {
    private String material;  // e.g., "Ceramic", "Plastic"
    private String color;     // e.g., "White", "Blue"
    private double diameter;  // in cm
    private boolean isDishwasherSafe;

    public Plate() {
    }

    public void setPlate(String material, String color, double diameter, boolean isDishwasherSafe) {
        this.material = material;
        this.color = color;
        this.diameter = diameter;
        this.isDishwasherSafe = isDishwasherSafe;
    }

    @Override
    public String toString() {
        return "Plate{material='" + material + "', color='" + color + "', diameter=" + diameter + "cm, isDishwasherSafe=" + isDishwasherSafe + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Plate) {
            Plate other = (Plate) obj;
            if (this.material.equals(other.material) && this.diameter == other.diameter) {
                System.out.println("Matching plate material and diameter..");
                return true;
            }
        }
        return false;
    }
}
