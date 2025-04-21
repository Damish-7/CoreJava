package com.xworkz.Abstracts.internal;

import javax.management.monitor.StringMonitor;

public class Terrace {
    String name;
    String color;
    public Terrace(String name, String color){
        this.color=color;
        this.name=name;
    }
    public void info(){
        System.out.println("Name of the slab "+ name);
        System.out.println("Model of the slab "+color);
    }
}

