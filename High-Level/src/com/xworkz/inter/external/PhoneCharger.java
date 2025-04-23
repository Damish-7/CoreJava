package com.xworkz.inter.external;

import com.xworkz.inter.internal.rules.Charger;

public class PhoneCharger implements Charger {
    @Override
    public void plugIn() {
        System.out.println("Charger plugged in");
    }

    @Override
    public void chargeDevice() {
        System.out.println("Device charging");
    }

    @Override
    public void unplug() {
        System.out.println("Charger unplugged");
    }
}
