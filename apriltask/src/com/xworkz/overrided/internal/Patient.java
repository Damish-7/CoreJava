package com.xworkz.overrided.internal;

public class Patient {
    public Patient() {
        System.out.println("Patient record initialized");
    }

    public void register() {
        System.out.println("Registering a new patient");
    }

    public void updateMedicalHistory() {
        System.out.println("Updating patient medical history");
    }
}
