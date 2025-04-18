package com.xworks.Object.internal;

import java.util.Objects;

public class Wire {
    private String type;       // e.g., "Copper", "Fiber"
    private double length;     // in meters
    private String color;      // e.g., "Red", "Black"
    private boolean isInsulated;

    public Wire() {
    }

    public void setWire(String type, double length, String color, boolean isInsulated) {
        this.type = type;
        this.length = length;
        this.color = color;
        this.isInsulated = isInsulated;
    }

    @Override
    public String toString() {
        return "Wire{type='" + type + "', length=" + length + "m, color='" + color + "', isInsulated=" + isInsulated + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Wire) {
            Wire other = (Wire) obj;
            if (this.type.equals(other.type) && this.length == other.length) {
                System.out.println("Matching wire type and length..");
                return true;
            }
        }
        return false;
    }
}
