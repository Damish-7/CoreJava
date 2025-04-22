package com.xworkz.inter.external;

import com.xworkz.inter.internal.rules.Table;

public class DiningTable implements Table {
    @Override
    public void placeItem() {
        System.out.println("Item placed on the table");
    }

    @Override
    public void removeItem() {
        System.out.println("Item removed from the table");
    }

    @Override
    public void fold() {
        System.out.println("Table folded");
    }

    @Override
    public void unfold() {
        System.out.println("Table unfolded");
    }

    @Override
    public void dirt() {
        System.out.println("Cleaning the table");
    }

    @Override
    public void polish() {
        System.out.println("Polishing the table surface");
    }

    @Override
    public void move() {
        System.out.println("Moving the table to a new location");
    }

    @Override
    public void checkStability() {
        System.out.println("Checking table stability");
    }

    @Override
    public void adjustHeight() {
        System.out.println("Adjusting the table height");
    }
}
