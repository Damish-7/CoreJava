package com.xworkz.overrided.internal;

public class Transport {
    private String name;
    private String location;

    public Transport() {
        System.out.println("General transport system is ready");
    }

    public void move() {
        System.out.println("Transport is moving");
    }
    public void setName(String name,String location){
        this.name=name;
        this.location=location;
    }
    @Override
    public String toString(){
        return " name"+name+"Location"+location;
    }
}
