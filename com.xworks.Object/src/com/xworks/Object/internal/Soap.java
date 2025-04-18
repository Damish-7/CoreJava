package com.xworks.Object.internal;

import java.util.Objects;

public class Soap {
    private String brand;
    private String scent;     // e.g., "Lavender", "Rose"
    private double weight;    // in grams
    private boolean isOrganic;

    public Soap() {
    }

    public void setSoap(String brand, String scent, double weight, boolean isOrganic) {
        this.brand = brand;
        this.scent = scent;
        this.weight = weight;
        this.isOrganic = isOrganic;
    }

    @Override
    public String toString() {
        return "Soap{brand='" + brand + "', scent='" + scent + "', weight=" + weight + "g, isOrganic=" + isOrganic + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Soap) {
            Soap other = (Soap) obj;
            if (this.brand.equals(other.brand) && this.scent.equals(other.scent)) {
                System.out.println("Matching soap brand and scent..");
                return true;
            }
        }
        return false;
    }
}
