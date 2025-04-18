package com.xworks.Object.internal;

import java.util.Objects;

public class Bicycle {
    private String brand;
    private String color;
    private int gearCount;
    private int wheelSize;

    public Bicycle() {
    }

    public void setBicycle(String brand, String color, int gearCount, int wheelSize) {
        this.brand = brand;
        this.color = color;
        this.gearCount = gearCount;
        this.wheelSize = wheelSize;
    }

    @Override
    public String toString() {
        return "Bicycle{brand='" + brand + "', color=" + color + ", gearCount=" + gearCount + ", wheelSize='" + wheelSize + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Bicycle) {
            Bicycle bicycle = (Bicycle) obj;
            if (Objects.equals(this.gearCount, bicycle.gearCount)) {
                System.out.println(" matching..");
                return true;
            }
        }
        return false;
    }
}
