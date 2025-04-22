package com.xworkz.inter.external;

import com.xworkz.inter.internal.rules.AirConditioner;

public class DaikinAirConditioner implements AirConditioner {
    @Override
    public void turnOn() {
        System.out.println("Daikin AC is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("Daikin AC is turning off");
    }

    @Override
    public void setTemperature() {
        System.out.println("Setting temperature on Daikin AC");
    }

    @Override
    public void swing() {
        System.out.println("Swinging Daikin AC vents");
    }

    @Override
    public void increaseFanSpeed() {
        System.out.println("Increasing fan speed of Daikin AC");
    }

    @Override
    public void decreaseFanSpeed() {
        System.out.println("Decreasing fan speed of Daikin AC");
    }

    @Override
    public void degree() {
        System.out.println("Cleaning Daikin AC");
    }
}
