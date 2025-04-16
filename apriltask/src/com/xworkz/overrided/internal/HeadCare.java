package com.xworkz.overrided.internal;

public class HeadCare extends Shampoo{
    public HeadCare() {
        System.out.println("Shampoo for bath");
    }

    @Override
    public void HeadWash() {
        System.out.println("Bath everyday");
    }

    public void HeadClean() {
        System.out.println("Be Clean ");
    }
}



