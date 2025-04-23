package com.xworkz.inter.external;

import com.xworkz.inter.internal.rules.Laptop;

public class GamingLaptop implements Laptop {
    @Override
    public void start() {
        System.out.println("Laptop started");
    }

    @Override
    public void shutdown() {
        System.out.println("Laptop shut down");
    }

    @Override
    public void openLid() {
        System.out.println("Lid opened");
    }

    @Override
    public void closeLid() {
        System.out.println("Lid closed");
    }

    @Override
    public void charge() {
        System.out.println("Charging laptop");
    }
}
