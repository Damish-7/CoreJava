package com.xworkz.overrided.internal;

    public class SpiderMan extends Hero {
        public SpiderMan() {
            System.out.println("Spider-Man swings into action");
        }

        @Override
        public void usePower() {
            System.out.println("Spider-Man shoots web");
        }

        public void climbWalls() {
            System.out.println("Spider-Man climbs walls");
        }
}
