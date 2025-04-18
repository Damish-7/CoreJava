package com.xworks.Object.internal;

import java.util.Objects;

public class Dress {
    private String brand;
    private String color;
    private String size;   // e.g., "S", "M", "L"
    private String material; // e.g., "Cotton", "Silk"

    public Dress() {
    }

    public void setDress(String brand, String color, String size, String material) {
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Dress{brand='" + brand + "', color='" + color + "', size='" + size + "', material='" + material + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Dress) {
            Dress other = (Dress) obj;
            if (this.brand.equals(other.brand) && this.size.equals(other.size)) {
                System.out.println("Matching dress brand and size..");
                return true;
            }
        }
        return false;
    }
}
