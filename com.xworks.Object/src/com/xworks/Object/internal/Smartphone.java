package com.xworks.Object.internal;

import java.util.Objects;

public class Smartphone {
    private String brand;
    private String model;
    private int price;
    private String storage;

    public Smartphone(String brand, String model, int price, String storage) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Smartphone{brand='" + brand + "', model='" + model + "', price=" + price + ", storage='" + storage + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Smartphone) {
            Smartphone smartphone = (Smartphone) obj;
            if (Objects.equals(this.price, smartphone.price)) {
                System.out.println("Smartphone is matching..");
                return true;
            }
        }
        return false;
    }
}
