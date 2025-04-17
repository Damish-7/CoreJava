package com.xworks.Object.internal;

import java.util.Objects;

public class Fridge {
    private String brand;
    private String capacity;
    private int price;
    private String type;

    public Fridge(String brand, String capacity, int price, String type) {
        this.brand = brand;
        this.capacity = capacity;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Fridge{brand='" + brand + "', capacity='" + capacity + "', price=" + price + ", type='" + type + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Fridge) {
            Fridge fridge = (Fridge) obj;
            if (Objects.equals(this.price, fridge.price)) {
                System.out.println("fridge is matching..");
                return true;
            }
        }
        return false;
    }
}
