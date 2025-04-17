package com.xworks.Object.internal;

import java.util.Objects;

public class WashingMachine {
    private String brand;
    private String type;
    private int price;
    private String capacity;

    public WashingMachine(String brand, String type, int price, String capacity) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "WashingMachine{brand='" + brand + "', type='" + type + "', price=" + price + ", capacity='" + capacity + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof WashingMachine) {
            WashingMachine wm = (WashingMachine) obj;
            if (Objects.equals(this.price, wm.price)) {
                System.out.println("Washing machine is matching..");
                return true;
            }
        }
        return false;
    }
}
