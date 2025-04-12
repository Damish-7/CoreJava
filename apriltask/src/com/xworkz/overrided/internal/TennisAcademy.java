package com.xworkz.overrided.internal;

public class TennisAcademy extends Academy {
    public TennisAcademy() {
        System.out.println("Tennis academy session initialized");
    }

    @Override
    public void conductTraining() {
        System.out.println("Conducting tennis-specific training sessions");
    }

    public void organizeTournament() {
        System.out.println("Organizing a local tennis tournament");
    }
}