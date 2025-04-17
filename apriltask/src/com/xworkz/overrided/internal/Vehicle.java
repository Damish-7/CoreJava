package com.xworkz.overrided.internal;

public class Vehicle {
    private String name;
    private int num;

    public Vehicle() {
        System.out.println("Vehicle is being created");
    }

    public void startEngine() {
        System.out.println("Engine started - regular vehicle");
    }
    public void setName(String name,int num){
        this.name=name;
        this.num=num;
    }
    @Override
    public String toString(){
        return "name"+name+"num"+num;
    }
}
