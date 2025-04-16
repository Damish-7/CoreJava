package com.xworkz.overrided.internal;

public class Pears extends Soap{
    public Pears() {
        System.out.println("Pears for bath");
    }

    @Override
    public void Bath() {
        System.out.println("Bath everyday");
    }

    public void Fresh() {
        System.out.println("Be Clean ");
    }
}

