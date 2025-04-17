package com.xworks.Object.internal;

import java.util.Objects;

public class Bag {
    private String brand;
    private String color;
    private int price;
    private String size;

    public Bag(String brand, String color, int price, String size) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Bag{brand='" + brand + "', color='" + color + "', price=" + price + ", size='" + size + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj!= null && obj instanceof Bag) {
            Bag bag = (Bag) obj;
            if (Objects.equals(this.price, bag.price)) {
                System.out.println("bag is matching..");
                return true;
            }
        }
        return false;
    }
}