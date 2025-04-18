package com.xworks.Object.internal;

import java.util.Objects;

public class Backpack {
    private String brand;
    private String color;
    private String material;
    private int capacity;

    public Backpack() {
    }

    public void setBackpack(String brand, String color, String material, int capacity) {
        this.brand = brand;
        this.color = color;
        this.material = material;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Backpack{brand='" + brand + "', color=" + color + ", material=" + material + ", capacity='" + capacity + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Backpack) {
            Backpack backpack = (Backpack) obj;
            if (Objects.equals(this.capacity, backpack.capacity)) {
                System.out.println(" matching..");
                return true;
            }
        }
        return false;
    }
}

