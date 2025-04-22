package com.xworkz.inter.external;

import com.xworkz.inter.internal.rules.Printer;

public class HPPrinter implements Printer {
    @Override
    public void powerOn() {
        System.out.println("HP printer is powering on");
    }

    @Override
    public void powerOff() {
        System.out.println("HP printer is powering off");
    }

    @Override
    public void print() {
        System.out.println("HP printer is printing a document");
    }

    @Override
    public void scan() {
        System.out.println("HP printer is scanning a document");
    }

    @Override
    public void copy() {
        System.out.println("HP printer is copying a document");
    }

    @Override
    public void loadPaper() {
        System.out.println("Loading paper into HP printer");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning HP printer");
    }
}
