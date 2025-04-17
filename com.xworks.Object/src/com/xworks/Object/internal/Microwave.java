package com.xworks.Object.internal;

import java.util.Objects;

public class Microwave {
    private String brand;
    private String type;
    private int price;
    private String capacity;

    public Microwave(String brand, String type, int price, String capacity) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Microwave{brand='" + brand + "', type='" + type + "', price=" + price + ", capacity='" + capacity + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Microwave) {
            Microwave microwave = (Microwave) obj;
            if (Objects.equals(this.price, microwave.price)) {
                System.out.println("Microwave is matching..");
                return true;
            }
        }
        return false;
    }
}
