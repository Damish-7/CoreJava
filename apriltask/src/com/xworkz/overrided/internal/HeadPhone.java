package com.xworkz.overrided.internal;

public class HeadPhone extends Headset{
    public HeadPhone() {
        System.out.println("HeadPhone for gaming");
    }

    @Override
    public void EarOn() {
        System.out.println("Conducting gaming");
    }

    public void Gameon() {
        System.out.println("Gaming on it ");
    }
}