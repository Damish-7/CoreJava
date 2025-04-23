package com.xworkz.inter.external;

import com.xworkz.inter.internal.rules.Remote;

public class TVRemote implements Remote {
    @Override
    public void turnOn() {
        System.out.println("TV turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("TV turned off");
    }

    @Override
    public void changeChannel() {
        System.out.println("Changing channel");
    }
}
