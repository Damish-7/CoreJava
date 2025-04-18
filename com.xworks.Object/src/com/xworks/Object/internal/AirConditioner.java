package com.xworks.Object.internal;

import java.util.Objects;

public class AirConditioner {
    private String brand;
    private String model;
    private double coolingCapacity; // in BTU (British Thermal Unit)
    private boolean inverterTechnology;

    public AirConditioner() {
    }

    public void setAirConditioner(String brand, String model, double coolingCapacity, boolean inverterTechnology) {
        this.brand = brand;
        this.model = model;
        this.coolingCapacity = coolingCapacity;
        this.inverterTechnology = inverterTechnology;
    }

    @Override
    public String toString() {
        return "AirConditioner{brand='" + brand + "', model='" + model + "', coolingCapacity=" + coolingCapacity + " BTU, inverterTechnology=" + inverterTechnology + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof AirConditioner) {
            AirConditioner other = (AirConditioner) obj;
            if (this.brand.equals(other.brand) && this.model.equals(other.model)) {
                System.out.println("Matching air conditioner brand and model..");
                return true;
            }
        }
        return false;
    }
}
