package com.xworkz.overrided.internal;

public class Zoo {
    private String name;
    private String Location;

    public Zoo() {
        System.out.println("Zoo is now open for visitors");
    }

    public void feedAnimals() {
        System.out.println("Feeding all animals in the zoo");
    }

    public void cleanCages() {
        System.out.println("Cleaning the animal enclosures");
    }
    public void setName(String name,String location){
        this.name=name;
        this.Location=location;
    }
    @Override
    public String toString(){
        return "zoo name"+name+"Location"+Location;
    }
}
