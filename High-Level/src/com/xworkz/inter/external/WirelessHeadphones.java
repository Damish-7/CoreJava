package com.xworkz.inter.external;

import com.xworkz.inter.internal.rules.Headphones;

public class WirelessHeadphones implements Headphones {
    @Override
    public void playAudio() {
        System.out.println("Playing audio through headphones");
    }

    @Override
    public void pauseAudio() {
        System.out.println("Audio paused");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Volume increased");
    }
}
