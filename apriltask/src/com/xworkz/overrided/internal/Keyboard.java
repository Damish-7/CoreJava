package com.xworkz.overrided.internal;

public class Keyboard extends Laptop {
    public Keyboard() {
        System.out.println("Keyboard for typing");
    }

    @Override
    public void coding() {
        System.out.println("Conducting coding");
    }

    public void conductwork() {
        System.out.println("Organizing a local tennis tournament");
    }
}
