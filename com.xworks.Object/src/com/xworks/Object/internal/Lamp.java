package com.xworks.Object.internal;

import java.util.Objects;

public class Lamp {
    private String brand;
    private String type;
    private String color;
    private int brightness;

    public Lamp() {
    }

    public void setLamp(String brand, String type, String color, int brightness) {
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.brightness = brightness;
    }

    @Override
    public String toString() {
        return "Lamp{brand='" + brand + "', type=" + type + ", color=" + color + ", brightness='" + brightness + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Lamp) {
            Lamp lamp = (Lamp) obj;
            if (Objects.equals(this.brightness, lamp.brightness)) {
                System.out.println(" matching..");
                return true;
            }
        }
        return false;
    }
}
