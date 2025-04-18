package com.xworks.Object.internal;

import java.util.Objects;

public class Curtain {
    private String fabric;
    private String color;
    private String pattern;
    private int length;

    public Curtain() {
    }

    public void setCurtain(String fabric, String color, String pattern, int length) {
        this.fabric = fabric;
        this.color = color;
        this.pattern = pattern;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Curtain{fabric='" + fabric + "', color=" + color + ", pattern=" + pattern + ", length='" + length + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Curtain) {
            Curtain curtain = (Curtain) obj;
            if (Objects.equals(this.length, curtain.length)) {
                System.out.println(" matching..");
                return true;
            }
        }
        return false;
    }
}
