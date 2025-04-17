package com.xworks.Object.internal;

import java.util.Objects;

public class Camera {
    private String brand;
    private String type;
    private int price;
    private String resolution;

    public Camera(String brand, String type, int price, String resolution) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Camera{brand='" + brand + "', type='" + type + "', price=" + price + ", resolution='" + resolution + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Camera) {
            Camera camera = (Camera) obj;
            if (Objects.equals(this.price, camera.price)) {
                System.out.println("camera is matching..");
                return true;
            }
        }
        return false;
    }
}
