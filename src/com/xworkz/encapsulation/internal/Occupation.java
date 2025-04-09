package com.xworkz.encapsulation.internal;

public class Occupation {
    private String title;
    private String sector;
    private int experienceYears;
    private boolean remote;
    private double salary;

    // Setters (package-private)
    void setTitle(String title) { this.title = title; }
    void setSector(String sector) { this.sector = sector; }
    void setExperienceYears(int experienceYears) { this.experienceYears = experienceYears; }
    void setRemote(boolean remote) { this.remote = remote; }
    void setSalary(double salary) { this.salary = salary; }

    // Getters (public)
    public String getTitle() { return title; }
    public String getSector() { return sector; }
    public int getExperienceYears() { return experienceYears; }
    public boolean isRemote() { return remote; }
    public double getSalary() { return salary; }

    public void work() {
        System.out.println("Working as a " + title + " in the " + sector + " sector.");
    }
}
