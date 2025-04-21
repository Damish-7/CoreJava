package com.xworkz.Abstracts.internal;

public abstract class Sensor {
    public abstract void automatic();
    public void manual(){
        System.out.println("Running manual in Sensor");
    }
}
