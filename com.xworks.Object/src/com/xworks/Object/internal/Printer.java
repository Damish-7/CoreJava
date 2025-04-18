package com.xworks.Object.internal;

import java.util.Objects;

public class Printer {
    private String brand;
    private String type;      // e.g., "Inkjet", "Laser"
    private double price;     // in USD
    private boolean wireless;

    public Printer() {
    }

    public void setPrinter(String brand, String type, double price, boolean wireless) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        return "Printer{brand='" + brand + "', type='" + type + "', price=" + price + ", wireless=" + wireless + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Printer) {
            Printer other = (Printer) obj;
            if (this.brand.equals(other.brand) && this.type.equals(other.type)) {
                System.out.println("Matching printer brand and type..");
                return true;
            }
        }
        return false;
    }
}
