package com.xworkz.overrided.internal;

public class ShoppingCart extends Cart {
    public ShoppingCart() {
        System.out.println("Shopping cart with items ready for checkout");
    }

    @Override
    public void addItem() {
        System.out.println("Item added to shopping cart with quantity");
    }

    public void applyDiscount() {
        System.out.println("Applying discount on the cart total");
    }
}
