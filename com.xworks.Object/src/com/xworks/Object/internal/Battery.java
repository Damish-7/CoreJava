package com.xworks.Object.internal;

import java.util.Objects;

public class Battery {
    private String brand;
    private String type;       // e.g., "Li-ion", "NiMH"
    private double capacity;    // in mAh (milliampere-hour)
    private boolean rechargeable;

    public Battery() {
    }

    public void setBattery(String brand, String type, double capacity, boolean rechargeable) {
        this.brand = brand;
        this.type = type;
        this.capacity = capacity;
        this.rechargeable = rechargeable;
    }

    @Override
    public String toString() {
        return "Battery{brand='" + brand + "', type='" + type + "', capacity=" + capacity + "mAh, rechargeable=" + rechargeable + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Battery) {
            Battery other = (Battery) obj;
            if (this.brand.equals(other.brand) && this.capacity == other.capacity) {
                System.out.println("Matching battery brand and capacity..");
                return true;
            }
        }
        return false;
    }
}
