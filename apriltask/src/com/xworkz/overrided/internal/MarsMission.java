package com.xworkz.overrided.internal;

    public class MarsMission extends SpaceMission {
        public MarsMission() {
            System.out.println("Mars Mission is prepared for interplanetary travel");
        }

        @Override
        public void launch() {
            System.out.println("Launching Mars rover with long-distance trajectory");
        }

        public void collectSamples() {
            System.out.println("Collecting Martian soil and rock samples");
        }
    }
