package com.xworkz.overrided.internal;

public class Tracker {
    private String name;
    private String location;

    public Tracker() {
        System.out.println("Initializing base tracking system");
    }

    public void track() {
        System.out.println("Tracking object location");
    }

    public void stopTracking() {
        System.out.println("Stopping tracking activity");
    }
    public void setName(String name,String location){
        this.name=name;
        this.location=location;
    }
    @Override
    public String toString(){
        return "name"+name+"Location"+location;
    }
}

