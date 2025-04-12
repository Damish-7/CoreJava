package com.xworkz.overrided.internal;

public class Voter {
    private String name;

    public Voter(String name) {
        this.name = name;
        System.out.println(name + " is registered as a voter");
    }

    public void vote() {
        System.out.println("Voter is casting a vote");
    }

    public void verifyIdentity() {
        System.out.println("Verifying voter identity");
    }
}
