package com.xworks.Object.internal;

import java.util.Objects;

public class Tool {
    private String type;  // e.g., "Hammer", "Drill"
    private String brand;
    private double weight;  // in kg
    private boolean powerTool;  // true for power tools like drills, false for manual tools like hammers

    public Tool() {
    }

    public void setTool(String type, String brand, double weight, boolean powerTool) {
        this.type = type;
        this.brand = brand;
        this.weight = weight;
        this.powerTool = powerTool;
    }

    @Override
    public String toString() {
        return "Tool{type='" + type + "', brand='" + brand + "', weight=" + weight + "kg, powerTool=" + powerTool + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Tool) {
            Tool other = (Tool) obj;
            if (this.type.equals(other.type) && this.brand.equals(other.brand)) {
                System.out.println("Matching tool type and brand..");
                return true;
            }
        }
        return false;
    }
}
