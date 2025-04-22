package com.xworkz.inter.external;

import com.xworkz.inter.internal.rules.Smartwatch;

public class FitnessWatch implements Smartwatch {
        @Override
        public void showTime() {
            System.out.println("Showing current time");
        }

        @Override
        public void trackSteps() {
            System.out.println("Tracking daily steps");
        }

        @Override
        public void measureHeartRate() {
            System.out.println("Measuring heart rate");
        }

        @Override
        public void startWorkout() {
            System.out.println("Workout started");
        }

        @Override
        public void stopWorkout() {
            System.out.println("Workout stopped");
        }

        @Override
        public void playMusic() {
            System.out.println("Playing music");
        }

        @Override
        public void stopMusic() {
            System.out.println("Stopping music");
        }

        @Override
        public void showNotifications() {
            System.out.println("Displaying notifications");
        }

        @Override
        public void powerOff() {
            System.out.println("Smartwatch powered off");
        }
    }
