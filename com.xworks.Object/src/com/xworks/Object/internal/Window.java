package com.xworks.Object.internal;

import java.util.Objects;

public class Window {
    private String material;
    private String type;
    private String color;
    private int height;

    public Window() {
    }

    public void setWindow(String material, String type, String color, int height) {
        this.material = material;
        this.type = type;
        this.color = color;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Window{material='" + material + "', type=" + type + ", color=" + color + ", height='" + height + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Window) {
            Window window = (Window) obj;
            if (Objects.equals(this.height, window.height)) {
                System.out.println(" matching..");
                return true;
            }
        }
        return false;
    }
}
