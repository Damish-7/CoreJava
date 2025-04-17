package com.xworks.Object.internal;

import java.util.Objects;

public class Headphones {
    private String brand;
    private String type;
    private int price;
    private String color;

    public Headphones(String brand, String type, int price, String color) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Headphones{brand='" + brand + "', type='" + type + "', price=" + price + ", color='" + color + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Headphones) {
            Headphones headphones = (Headphones) obj;
            if (Objects.equals(this.price, headphones.price)) {
                System.out.println("headphones are matching..");
                return true;
            }
        }
        return false;
    }
}
