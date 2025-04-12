package com.xworkz.overrided.internal;

public class FootballPlayer extends Player {
    public FootballPlayer() {
        System.out.println("Football player is ready for the match");
    }

    @Override
    public void play() {
        System.out.println("Football player is dribbling the ball");
    }

    public void scoreGoal() {
        System.out.println("Football player scores a goal!");
    }
}
