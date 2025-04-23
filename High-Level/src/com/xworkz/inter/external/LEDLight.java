package com.xworkz.inter.external;

import com.xworkz.inter.internal.rules.Light;

public class LEDLight implements Light {
    @Override
    public void switchOn() {
        System.out.println("Light switched on");
    }

    @Override
    public void switchOff() {
        System.out.println("Light switched off");
    }

    @Override
    public void dim() {
        System.out.println("Light dimmed");
    }
}
