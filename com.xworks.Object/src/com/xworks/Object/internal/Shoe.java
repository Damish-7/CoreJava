package com.xworks.Object.internal;

import java.util.Objects;

public class Shoe {
    private String brand;
    private String type;
    private int price;
    private String size;

    public Shoe(String brand, String type, int price, String size) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shoes{brand='" + brand + "', type='" + type + "', price=" + price + ", size='" + size + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Shoe) {
            Shoe shoe = (Shoe) obj;
            if (Objects.equals(this.price, shoe.price)) {
                System.out.println("shoes are matching..");
                return true;
            }
        }
        return false;
    }
}
