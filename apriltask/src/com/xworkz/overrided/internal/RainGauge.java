package com.xworkz.overrided.internal;

public class RainGauge extends WeatherStation {
    public RainGauge() {
        System.out.println("Rain gauge set to collect rainfall data");
    }

    @Override
    public void measure() {
        System.out.println("Measuring rainfall intensity and volume");
    }

    public void report() {
        System.out.println("Rain data sent to meteorological department");
    }
}
