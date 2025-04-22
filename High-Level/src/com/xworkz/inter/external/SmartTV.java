package com.xworkz.inter.external;

import com.xworkz.inter.internal.rules.TV;

public class SmartTV implements TV {
    @Override
    public void powerOn() {
        System.out.println("TV powered on");
    }

    @Override
    public void powerOff() {
        System.out.println("TV powered off");
    }

    @Override
    public void changeChannel() {
        System.out.println("Channel changed");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Volume increased");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("Volume decreased");
    }

    @Override
    public void mute() {
        System.out.println("TV muted");
    }

    @Override
    public void nomute() {
        System.out.println("TV unmuted");
    }

    @Override
    public void openSettings() {
        System.out.println("Opening settings");
    }

    @Override
    public void connectToWifi() {
        System.out.println("Connecting to Wi-Fi");
    }
}
