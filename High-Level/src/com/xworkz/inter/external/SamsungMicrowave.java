package com.xworkz.inter.external;

import com.xworkz.inter.internal.rules.Microwave;

public class SamsungMicrowave implements Microwave {
    @Override
    public void powerOn() {
        System.out.println("Samsung microwave is powering on");
    }

    @Override
    public void powerOff() {
        System.out.println("Samsung microwave is powering off");
    }

    @Override
    public void setTimer() {
        System.out.println("Setting timer on Samsung microwave");
    }

    @Override
    public void setTemperature() {
        System.out.println("Setting temperature on Samsung microwave");
    }

    @Override
    public void startCooking() {
        System.out.println("Samsung microwave is starting to cook");
    }

    @Override
    public void stopCooking() {
        System.out.println("Samsung microwave stopped cooking");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning Samsung microwave");
    }
}
