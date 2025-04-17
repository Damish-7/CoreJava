package com.xworks.Object.internal;
import java.util.Objects;

public class TV {
    private String brand;
    private String displayType;
    private int price;
    private String size;

    public TV(String brand, String displayType, int price, String size) {
        this.brand = brand;
        this.displayType = displayType;
        this.price = price;
        this.size = size;
    }

    @Override
    public String toString() {
        return "TV{brand='" + brand + "', displayType='" + displayType + "', price=" + price + ", size='" + size + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof TV) {
            TV tv = (TV) obj;
            if (Objects.equals(this.price, tv.price)) {
                System.out.println("tv is matching..");
                return true;
            }
        }
        return false;
    }
}
