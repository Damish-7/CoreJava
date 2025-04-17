package com.xworkz.overrided.internal;

public class Voter {
    private String name;
    private int vot_id;

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
    public void setName(String name,int vot_id){
        this.name=name;
        this.vot_id=vot_id;
    }
    @Override
    public String toString(){
        return " name"+name+"vot_id"+vot_id;
    }
}
