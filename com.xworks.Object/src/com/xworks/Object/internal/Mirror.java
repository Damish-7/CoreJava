package com.xworks.Object.internal;

import java.util.Objects;

public class Mirror {
    private String shape;
    private String frameMaterial;
    private String size;
    private int price;

    public Mirror() {
    }

    public void setMirror(String shape, String frameMaterial, String size, int price) {
        this.shape = shape;
        this.frameMaterial = frameMaterial;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mirror{shape='" + shape + "', frameMaterial=" + frameMaterial + ", size=" + size + ", price='" + price + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Mirror) {
            Mirror mirror = (Mirror) obj;
            if (Objects.equals(this.price, mirror.price)) {
                System.out.println(" matching..");
                return true;
            }
        }
        return false;
    }
}

