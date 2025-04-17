package com.xworks.Object.internal;
import java.util.Objects;

public class Laptop {
    private String brand;
    private String processor;
    private int price;
    private String color;

    public Laptop(String brand, String processor, int price, String color) {
        this.brand = brand;
        this.processor = processor;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Laptop{brand='" + brand + "', processor='" + processor + "', price=" + price + ", color='" + color + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Laptop) {
            Laptop laptop = (Laptop) obj;
            if (Objects.equals(this.price, laptop.price)) {
                System.out.println("laptop is matching..");
                return true;
            }
        }
        return false;
    }
}
