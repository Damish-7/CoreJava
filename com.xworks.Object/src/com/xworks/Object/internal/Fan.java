package com.xworks.Object.internal;

import java.util.Objects;

public class Fan {
    private String brand;
    private String type;
    private int price;
    private String color;

    public Fan(String brand, String type, int price, String color) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fan{brand='" + brand + "', type='" + type + "', price=" + price + ", color='" + color + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Fan) {
            Fan fan = (Fan) obj;
            if (Objects.equals(this.price, fan.price)) {
                System.out.println("fan is matching..");
                return true;
            }
        }
        return false;
    }
}