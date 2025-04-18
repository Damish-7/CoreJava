package com.xworks.Object.internal;

import java.util.Objects;

public class Router {
    private String brand;
    private String model;
    private double speed;      // in Mbps
    private boolean dualBand;

    public Router() {
    }

    public void setRouter(String brand, String model, double speed, boolean dualBand) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
        this.dualBand = dualBand;
    }

    @Override
    public String toString() {
        return "Router{brand='" + brand + "', model='" + model + "', speed=" + speed + "Mbps, dualBand=" + dualBand + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Router) {
            Router other = (Router) obj;
            if (this.brand.equals(other.brand) && this.speed == other.speed) {
                System.out.println("Matching router brand and speed..");
                return true;
            }
        }
        return false;
    }
}
