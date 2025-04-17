package com.xworks.Object.internal;

import java.util.Objects;

public class Monitor {
    private String brand;
    private String resolution;
    private int price;
    private String size;

    public Monitor(String brand, String resolution, int price, String size) {
        this.brand = brand;
        this.resolution = resolution;
        this.price = price;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Monitor{brand='" + brand + "', resolution='" + resolution + "', price=" + price + ", size='" + size + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Monitor) {
            Monitor monitor = (Monitor) obj;
            if (Objects.equals(this.price, monitor.price)) {
                System.out.println("monitor is matching..");
                return true;
            }
        }
        return false;
    }
}

