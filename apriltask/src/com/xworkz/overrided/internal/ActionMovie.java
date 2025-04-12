package com.xworkz.overrided.internal;

public class ActionMovie extends Movie {
    public ActionMovie() {
        System.out.println("Action movie with thrilling scenes is ready");
    }

    @Override
    public void play() {
        System.out.println("Action movie is playing with explosions and chase scenes");
    }

    public void stunt() {
        System.out.println("A thrilling stunt is happening on screen");
    }
}