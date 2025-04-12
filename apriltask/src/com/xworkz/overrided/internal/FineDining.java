package com.xworkz.overrided.internal;

public class FineDining extends Restaurant {
    public FineDining() {
        System.out.println("Fine dining setup with elegant ambiance");
    }

    @Override
    public void serveFood() {
        System.out.println("Serving gourmet cuisine with multiple courses");
    }

    public void pairWine() {
        System.out.println("Pairing wine with the main course");
    }
}
