package com.xworkz.overrided.runner;

import com.xworkz.overrided.internal.Generator;
import com.xworkz.overrided.internal.Inverter;

public class runner {
    public static void main(String[] args){

        Generator generator=new Inverter();
        generator.motor();

        Inverter inverter=new Inverter();
        inverter.motor();

        Inverter inverter2=(Inverter) inverter;
        inverter2.backup();
    }
}
