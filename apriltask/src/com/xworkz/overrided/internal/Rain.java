package com.xworkz.overrided.internal;

    public class Rain extends Weather {
        public Rain() {
            System.out.println("Rainy weather has arrived");
        }

        @Override
        public void forecast() {
            System.out.println("It is raining heavily");
        }

        public void bringUmbrella() {
            System.out.println("Don't forget to bring your umbrella!");
        }
    }

