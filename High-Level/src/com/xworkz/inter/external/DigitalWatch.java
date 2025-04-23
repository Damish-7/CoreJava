package com.xworkz.inter.external;

import com.xworkz.inter.internal.rules.Watch;

public class DigitalWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println("Showing time");
    }

    @Override
    public void setAlarm() {
        System.out.println("Alarm set");
    }

    @Override
    public void checkDate() {
        System.out.println("Displaying date");
    }

    @Override
    public void stopwatch() {
        System.out.println("Stopwatch running");
    }

    @Override
    public void timer() {
        System.out.println("Timer started");
    }
}
