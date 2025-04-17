package com.xworks.Object.internal;

import java.util.Objects;

public class Keyboard {
    private String brand;
    private String type;
    private int price;
    private String connectionType;

    public Keyboard(String brand, String type, int price, String connectionType) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.connectionType = connectionType;
    }

    @Override
    public String toString() {
        return "Keyboard{brand='" + brand + "', type='" + type + "', price=" + price + ", connectionType='" + connectionType + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Keyboard) {
            Keyboard keyboard = (Keyboard) obj;
            if (Objects.equals(this.price, keyboard.price)) {
                System.out.println("keyboard is matching..");
                return true;
            }
        }
        return false;
    }
}