package com.xworkz.overrided.internal;

public class Wireless extends AirPod{
    public Wireless() {
        System.out.println("ear product");
    }

    @Override
    public void EarGood() {
        System.out.println("To hear good");
    }

    public void Sounds() {
        System.out.println("To good sound ");
    }
}
