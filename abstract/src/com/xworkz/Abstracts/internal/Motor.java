package com.xworkz.Abstracts.internal;

public class Motor extends Sensor{
    @Override
    public void automatic() {
        System.out.println("overridden method ridge in table");
    }

    @Override
    public void manual() {
        super.manual();
    }
}