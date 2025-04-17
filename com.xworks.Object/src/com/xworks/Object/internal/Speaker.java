package com.xworks.Object.internal;

import java.util.Objects;

public class Speaker {
    private String brand;
    private String type;
    private int price;
    private String connectivity;

    public Speaker(String brand, String type, int price, String connectivity) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.connectivity = connectivity;
    }

    @Override
    public String toString() {
        return "Speaker{brand='" + brand + "', type='" + type + "', price=" + price + ", connectivity='" + connectivity + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Speaker) {
            Speaker speaker = (Speaker) obj;
            if (Objects.equals(this.price, speaker.price)) {
                System.out.println("speaker is matching..");
                return true;
            }
        }
        return false;
    }
}
