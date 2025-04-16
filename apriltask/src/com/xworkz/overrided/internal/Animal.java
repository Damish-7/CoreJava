package com.xworkz.overrided.internal;

public class Animal {
    private String name;
    private String sound;

    public Animal(String name,String sound) {
        System.out.println("An animal is born");
    }

    public void sound() {
        System.out.println("Animal makes a sound");
    }
    @Override
    public String toString(){
        return "Animal name"+name+ "sound"+sound;
    }
}
