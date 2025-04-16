package com.xworkz.overrided.internal;

public class Academy {
    private String name;
    private String course;


    public Academy(String name,String course) {
        System.out.println("Sports academy registration started");
    }

    public void conductTraining() {
        System.out.println("Conducting general sports training");
    }

    public void scheduleMatch() {
        System.out.println("Scheduling internal practice matches");
    }
    @Override
    public String toString(){
        return "Academy name"+name+"Course name"+course;
    }
}
