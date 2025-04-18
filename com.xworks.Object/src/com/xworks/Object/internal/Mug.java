package com.xworks.Object.internal;

import java.util.Objects;

public class Mug {
    private String material;     // e.g., "Ceramic", "Glass"
    private String design;       // e.g., "Printed", "Plain"
    private double volume;       // in ml
    private boolean hasHandle;

    public Mug() {
    }

    public void setMug(String material, String design, double volume, boolean hasHandle) {
        this.material = material;
        this.design = design;
        this.volume = volume;
        this.hasHandle = hasHandle;
    }

    @Override
    public String toString() {
        return "Mug{material='" + material + "', design='" + design + "', volume=" + volume + "ml, hasHandle=" + hasHandle + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Mug) {
            Mug other = (Mug) obj;
            if (this.material.equals(other.material) && this.volume == other.volume) {
                System.out.println("Matching mug material and volume..");
                return true;
            }
        }
        return false;
    }
}
