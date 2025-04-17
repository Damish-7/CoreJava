package com.xworks.Object.internal;

import java.util.Objects;

public class Bike {
    private String brand;
    private String model;
    private int price;
    private String engineType;

    public Bike(String brand, String model, int price, String engineType) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Bike{brand='" + brand + "', model='" + model + "', price=" + price + ", engineType='" + engineType + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Bike) {
            Bike bike = (Bike) obj;
            if (Objects.equals(this.price, bike.price)) {
                System.out.println("bike is matching..");
                return true;
            }
        }
        return false;
    }
}
