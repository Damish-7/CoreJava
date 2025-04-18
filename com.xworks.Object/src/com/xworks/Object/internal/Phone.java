package com.xworks.Object.internal;

import java.util.Objects;

public class Phone {
    private String brand;
    private String model;
    private String color;
    private int storage;

    public Phone() {
    }

    public void setPhone(String brand, String model, String color, int storage) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Phone{brand='" + brand + "', model=" + model + ", color=" + color + ", storage='" + storage + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Phone) {
            Phone phone = (Phone) obj;
            if (Objects.equals(this.storage, phone.storage)) {
                System.out.println(" matching..");
                return true;
            }
        }
        return false;
    }
}
