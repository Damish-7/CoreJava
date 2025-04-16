package com.xworkz.overrided.internal;

public class Attraction {
    private String name;
    private String ride;


    public Attraction(String name,String ride) {
        System.out.println("Theme park attraction initialized");
    }

    public void startRide() {
        System.out.println("Starting general ride");
    }

    public void stopRide() {
        System.out.println("Stopping ride safely");
    }
    @Override
    public String toString(){
        return "Attraction "+name+ "ride"+ride;
    }
}
