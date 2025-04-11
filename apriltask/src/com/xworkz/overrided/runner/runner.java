package com.xworkz.overrided.runner;

import com.xworkz.overrided.internal.*;


public class runner {
    public static void main(String[] args){

        Generator generator=new Inverter();
        generator.motor();

        Inverter inverter=new Inverter();
        inverter.motor();

        Inverter inverter2=(Inverter) inverter;
        inverter2.backup();

        Machine machine = new Robot();
        machine.start();

        Robot robot = new Robot();
        robot.start();
        robot.scan();

        Robot robot2 = (Robot) machine;
        robot2.scan();
    }
}
