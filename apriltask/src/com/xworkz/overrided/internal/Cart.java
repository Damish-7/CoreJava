package com.xworkz.overrided.internal;

public class Cart {
    public Cart() {
        System.out.println("Shopping cart initialized");
    }

    public void addItem() {
        System.out.println("Item added to cart");
    }

    public void checkout() {
        System.out.println("Proceeding to checkout");
    }
}
