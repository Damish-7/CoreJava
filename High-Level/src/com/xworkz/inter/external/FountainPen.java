package com.xworkz.inter.external;

import com.xworkz.inter.internal.rules.Pen;

public class FountainPen implements Pen {
    @Override
    public void write() {
        System.out.println("Writing with fountain pen");
    }

    @Override
    public void openCap() {
        System.out.println("Opening cap");
    }

    @Override
    public void closeCap() {
        System.out.println("Closing cap");
    }

    @Override
    public void refillInk() {
        System.out.println("Refilling ink");
    }

    @Override
    public void changeNib() {
        System.out.println("Changing nib");
    }

    @Override
    public void draw() {
        System.out.println("Drawing with fountain pen");
    }

    @Override
    public void highlight() {
        System.out.println("Highlighting text");
    }

    @Override
    public void eraseInk() {
        System.out.println("Erasing ink");
    }

    @Override
    public void shake() {
        System.out.println("Shaking pen to get ink flowing");
    }
}
