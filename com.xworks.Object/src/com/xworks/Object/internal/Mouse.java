package com.xworks.Object.internal;

import java.util.Objects;

public class Mouse {
    private String brand;
    private String type;
    private int price;
    private String connectivity;

    public Mouse(String brand, String type, int price, String connectivity) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.connectivity = connectivity;
    }

    @Override
    public String toString() {
        return "Mouse{brand='" + brand + "', type='" + type + "', price=" + price + ", connectivity='" + connectivity + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Mouse) {
            Mouse mouse = (Mouse) obj;
            if (Objects.equals(this.price, mouse.price)) {
                System.out.println("mouse is matching..");
                return true;
            }
        }
        return false;
    }
}
