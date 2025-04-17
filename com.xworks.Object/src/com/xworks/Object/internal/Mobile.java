package com.xworks.Object.internal;

import java.util.Objects;

public class Mobile {
    private String brand;
    private String model;
    private int price;
    private String os;

    public Mobile(String brand, String model, int price, String os) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.os = os;
    }

    @Override
    public String toString() {
        return "Mobile{brand='" + brand + "', model='" + model + "', price=" + price + ", os='" + os + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Mobile) {
            Mobile mobile = (Mobile) obj;
            if (Objects.equals(this.price, mobile.price)) {
                System.out.println("mobile is matching..");
                return true;
            }
        }
        return false;
    }
}
