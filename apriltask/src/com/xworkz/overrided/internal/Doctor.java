package com.xworkz.overrided.internal;

public class Doctor extends Patient {
    public Doctor() {
        System.out.println("Doctor profile created");
    }

    @Override
    public void register() {
        System.out.println("Doctor registration completed");
    }

    public void prescribeMedication() {
        System.out.println("Doctor prescribes medication to patient");
    }
}