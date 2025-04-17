package com.xworks.Object.internal;

import java.util.Objects;

public class Bottle {
    private String brand;
    private String color;
    private int price;
    private String material;

    public Bottle(String brand, String color, int price, String material) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Bottle{brand='" + brand + "', color='" + color + "', price=" + price + ", material='" + material + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Bottle) {
            Bottle bottle = (Bottle) obj;
            if (Objects.equals(this.price, bottle.price)) {
                System.out.println("bottle is matching..");
                return true;
            }
        }
        return false;
    }
}