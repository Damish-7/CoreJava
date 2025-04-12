package com.xworkz.overrided.internal;

public class Dog extends Animal {
    public Dog() {
        System.out.println("A dog is ready to play");
    }

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    public void fetch() {
        System.out.println("Dog is fetching the ball");
    }
}

