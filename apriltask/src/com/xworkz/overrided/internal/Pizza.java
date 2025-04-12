package com.xworkz.overrided.internal;

public class Pizza extends Food {
    public Pizza() {
        System.out.println("Pizza is fresh out of the oven");
    }

    @Override
    public void serve() {
        System.out.println("Serving hot cheesy pizza");
    }

    public void addToppings() {
        System.out.println("Adding extra toppings to pizza");
    }
}

