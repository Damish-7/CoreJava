package com.xworks.Object.internal;

import java.util.Objects;

public class Projector {
    private String brand;
    private String resolution;
    private int lumens;
    private boolean portable;

    public Projector() {
    }

    public void setProjector(String brand, String resolution, int lumens, boolean portable) {
        this.brand = brand;
        this.resolution = resolution;
        this.lumens = lumens;
        this.portable = portable;
    }

    @Override
    public String toString() {
        return "Projector{brand='" + brand + "', resolution='" + resolution + "', lumens=" + lumens + ", portable=" + portable + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Projector) {
            Projector other = (Projector) obj;
            if (this.brand.equals(other.brand) && this.lumens == other.lumens) {
                System.out.println("Matching projector brand and lumens..");
                return true;
            }
        }
        return false;
    }
}
