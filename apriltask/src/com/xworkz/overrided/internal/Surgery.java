package com.xworkz.overrided.internal;

public class Surgery extends MedicalService {
    public Surgery() {
        System.out.println("Surgical team is ready for operation");
    }

    @Override
    public void provideService() {
        System.out.println("Performing complex surgical procedure");
    }

    public void sterilizeTools() {
        System.out.println("Sterilizing surgical instruments");
    }
}
