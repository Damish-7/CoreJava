package com.xworkz.inter.external;

import com.xworkz.inter.internal.rules.WashingMachine;

public class LGWashingMachine implements WashingMachine {
    @Override
    public void start() {
        System.out.println("LG washing machine is starting");
    }

    @Override
    public void stop() {
        System.out.println("LG washing machine is stopping");
    }

    @Override
    public void wash() {
        System.out.println("LG washing machine is washing clothes");
    }

    @Override
    public void rinse() {
        System.out.println("LG washing machine is rinsing clothes");
    }

    @Override
    public void spin() {
        System.out.println("LG washing machine is spinning clothes");
    }

    @Override
    public void addDetergent() {
        System.out.println("Adding detergent to LG washing machine");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning LG washing machine");
    }
}
