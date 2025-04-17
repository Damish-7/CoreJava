package com.xworks.Object.internal;

import java.util.Objects;

public class AC {
    private String brand;
    private String type;
    private int price;
    private String capacity;

    public AC(String brand, String type, int price, String capacity) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "AC{brand='" + brand + "', type='" + type + "', price=" + price + ", capacity='" + capacity + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof AC) {
            AC ac = (AC) obj;
            if (Objects.equals(this.price, ac.price)) {
                System.out.println("AC is matching..");
                return true;
            }
        }
        return false;
    }
}
