package com.xworks.Object.internal;

import java.util.Objects;

public class SmartWatch {
    private String brand;
    private String model;
    private int price;
    private String color;

    public SmartWatch(String brand, String model, int price, String color) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Smartwatch{brand='" + brand + "', model='" + model + "', price=" + price + ", color='" + color + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof SmartWatch) {
            SmartWatch smartwatch = (SmartWatch) obj;
            if (Objects.equals(this.price, smartwatch.price)) {
                System.out.println("SmartWatch is matching..");
                return true;
            }
        }
        return false;
    }
}
