package com.xworks.Object.internal;

import java.util.Objects;

public class Flashlight {
    private String brand;
    private String type;
    private int brightnessLevel;  // measured in lumens
    private boolean isRechargeable;

    public Flashlight() {
    }

    public void setFlashlight(String brand, String type, int brightnessLevel, boolean isRechargeable) {
        this.brand = brand;
        this.type = type;
        this.brightnessLevel = brightnessLevel;
        this.isRechargeable = isRechargeable;
    }

    @Override
    public String toString() {
        return "Flashlight{brand='" + brand + "', type='" + type + "', brightnessLevel=" + brightnessLevel + " lumens, isRechargeable=" + isRechargeable + "}";
    }
}