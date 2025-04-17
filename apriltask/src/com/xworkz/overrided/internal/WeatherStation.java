package com.xworkz.overrided.internal;

public class WeatherStation {
    private String weather;
    private String location;


    public WeatherStation() {
        System.out.println("Initializing weather station");
    }

    public void measure() {
        System.out.println("Measuring general atmospheric conditions");
    }
    public void setName(String weather ,String location){
        this.weather=weather    ;
        this.location=location;
    }
    @Override
    public String toString(){
        return "weather name"+weather+"Location"+location;
    }
}
