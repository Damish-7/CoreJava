package com.xworks.Object.internal;

import java.util.Objects;

public class Television {
    private String brand;
    private String screenType;
    private int size;
    private boolean isSmart;

    public Television() {
    }

    public void setTelevision(String brand, String screenType, int size, boolean isSmart) {
        this.brand = brand;
        this.screenType = screenType;
        this.size = size;
        this.isSmart = isSmart;
    }

    @Override
    public String toString() {
        return "Television{brand='" + brand + "', screenType=" + screenType + ", size=" + size + " inches, isSmart=" + isSmart + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Television) {
            Television television = (Television) obj;
            if (Objects.equals(this.isSmart, television.isSmart)) {
                System.out.println(" matching..");
                return true;
            }
        }
        return false;
    }
}
