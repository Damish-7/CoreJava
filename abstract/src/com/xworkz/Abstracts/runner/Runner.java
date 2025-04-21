package com.xworkz.Abstracts.runner;

import com.xworkz.Abstracts.internal.*;

public class Runner {
    public static void main(String[] args) {
        Artist artist = new Creative();
        artist.paint();
        Battery battery= new Power();
        battery.Lithium();
        Sensor sensor=new Motor();
        sensor.automatic();
        sensor.manual();
        Terrace terrace = new Slab();
        terrace.info();
        Appliances appliances= new Machines();
        appliances.fridge();
        appliances.microwaveOven();
        appliances.television();
        appliances.washingMachine();
    }
}



