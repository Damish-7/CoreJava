package com.xworkz.overrided.internal;

public class AirPod {
    private String name;
    private String brand;


    public AirPod(String name,String brand ) {
        System.out.println("Airpod to ear");
    }

    public void EarGood() {
        System.out.println("To ear");
    }

    public void GoodSound() {
        System.out.println("sound good");
    }
    @Override
    public String toString(){
        return "AirPod name"+name+"Brand "+brand;
    }
}


