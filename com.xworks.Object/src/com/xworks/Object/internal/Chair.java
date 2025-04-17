package com.xworks.Object.internal;

import java.util.Objects;

public class Chair {
    private String brand;
    private String material;
    private int price;
    private String color;

    public Chair(String brand, String material, int price, String color) {
        this.brand = brand;
        this.material = material;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Chair{brand='" + brand + "', material='" + material + "', price=" + price + ", color='" + color + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Chair) {
            Chair chair = (Chair) obj;
            if (Objects.equals(this.price, chair.price)) {
                System.out.println("chair is matching..");
                return true;
            }
        }
        return false;
    }
}