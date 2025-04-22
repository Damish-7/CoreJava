package com.xworkz.inter.external;

import com.xworkz.inter.internal.rules.CoffeeMachine;

public class EspressoMachine implements CoffeeMachine {
    @Override
    public void start() {
        System.out.println("Espresso machine is starting");
    }

    @Override
    public void stop() {
        System.out.println("Espresso machine is stopping");
    }

    @Override
    public void brew() {
        System.out.println("Espresso machine is brewing coffee");
    }

    @Override
    public void addWater() {
        System.out.println("Adding water to the espresso machine");
    }

    @Override
    public void addCoffee() {
        System.out.println("Adding coffee to the espresso machine");
    }

    @Override
    public void setTimer() {
        System.out.println("Setting timer on espresso machine");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the espresso machine");
    }
}
