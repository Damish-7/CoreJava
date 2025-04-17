package com.xworks.Object.internal;

import java.util.Objects;

public class Drone {
    private String brand;
    private String model;
    private int price;
    private String cameraResolution;

    public Drone(String brand, String model, int price, String cameraResolution) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.cameraResolution = cameraResolution;
    }

    @Override
    public String toString() {
        return "Drone{brand='" + brand + "', model='" + model + "', price=" + price + ", cameraResolution='" + cameraResolution + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Drone) {
            Drone drone = (Drone) obj;
            if (Objects.equals(this.price, drone.price)) {
                System.out.println("Drone is matching..");
                return true;
            }
        }
        return false;
    }
}
