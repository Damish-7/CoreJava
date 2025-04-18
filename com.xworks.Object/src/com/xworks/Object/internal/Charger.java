package com.xworks.Object.internal;

import java.util.Objects;

public class Charger {
    private String brand;
    private String type; // e.g., "USB-C", "Micro-USB"
    private int power;   // in watts
    private boolean fastCharging;

    public Charger() {
    }

    public void setCharger(String brand, String type, int power, boolean fastCharging) {
        this.brand = brand;
        this.type = type;
        this.power = power;
        this.fastCharging = fastCharging;
    }

    @Override
    public String toString() {
        return "Charger{brand='" + brand + "', type='" + type + "', power=" + power + "W, fastCharging=" + fastCharging + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Charger) {
            Charger other = (Charger) obj;
            if (this.brand.equals(other.brand) && this.power == other.power) {
                System.out.println("Matching charger brand and power..");
                return true;
            }
        }
        return false;
    }
}
