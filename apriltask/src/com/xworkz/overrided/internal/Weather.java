package com.xworkz.overrided.internal;

public class Weather {
    private String name;
    private String location;


    public Weather() {
        System.out.println("Weather is being observed");
    }

    public void forecast() {
        System.out.println("The weather is clear and sunny");
    }
    public void setName(String name,String location){
        this.name=name;
        this.location=location;
    }
    @Override
    public String toString(){
        return "Weather_name"+name+"Location"+location;
    }
}
