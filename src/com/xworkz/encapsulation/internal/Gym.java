package com.xworkz.encapsulation.internal;

public class Gym {
    private String name;
    private String location;
    private int trainers;
    private boolean hasSauna;
    private double membershipFee;

    // Setters (package-private)
    void setName(String name) { this.name = name; }
    void setLocation(String location) { this.location = location; }
    void setTrainers(int trainers) { this.trainers = trainers; }
    void setHasSauna(boolean hasSauna) { this.hasSauna = hasSauna; }
    void setMembershipFee(double membershipFee) { this.membershipFee = membershipFee; }

    // Getters (public)
    public String getName() { return name; }
    public String getLocation() { return location; }
    public int getTrainers() { return trainers; }
    public boolean hasSauna() { return hasSauna; }
    public double getMembershipFee() { return membershipFee; }

    public void workout() {
        System.out.println(name + " gym is currently hosting a workout session.");
    }
}
