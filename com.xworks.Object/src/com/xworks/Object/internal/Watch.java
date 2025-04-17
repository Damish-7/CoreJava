package com.xworks.Object.internal;
import java.util.Objects;

public class Watch {
    private String brand;
    private String type;
    private int price;
    private String strapMaterial;

    public Watch(String brand, String type, int price, String strapMaterial) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.strapMaterial = strapMaterial;
    }

    @Override
    public String toString() {
        return "Watch{brand='" + brand + "', type='" + type + "', price=" + price + ", strapMaterial='" + strapMaterial + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Watch) {
            Watch watch = (Watch) obj;
            if (Objects.equals(this.price, watch.price)) {
                System.out.println("watch is matching..");
                return true;
            }
        }
        return false;
    }
}