package com.xworks.Object.internal;

import java.util.Objects;

public class Cap {
    private String brand;
    private String color;
    private String material;      // e.g., "Cotton", "Polyester"
    private boolean adjustable;

    public Cap() {
    }

    public void setCap(String brand, String color, String material, boolean adjustable) {
        this.brand = brand;
        this.color = color;
        this.material = material;
        this.adjustable = adjustable;
    }

    @Override
    public String toString() {
        return "Cap{brand='" + brand + "', color='" + color + "', material='" + material + "', adjustable=" + adjustable + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Cap) {
            Cap other = (Cap) obj;
            if (this.brand.equals(other.brand) && this.color.equals(other.color)) {
                System.out.println("Matching cap brand and color..");
                return true;
            }
        }
        return false;
    }
}
