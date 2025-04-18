package com.xworks.Object.internal;

import java.util.Objects;

public class Helmet {
    private String brand;
    private String type;
    private String color;
    private int size;

    public Helmet() {
    }

    public void setHelmet(String brand, String type, String color, int size) {
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Helmet{brand='" + brand + "', type=" + type + ", color=" + color + ", size='" + size + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Helmet) {
            Helmet helmet = (Helmet) obj;
            if (Objects.equals(this.size, helmet.size)) {
                System.out.println(" matching..");
                return true;
            }
        }
        return false;
    }
}
