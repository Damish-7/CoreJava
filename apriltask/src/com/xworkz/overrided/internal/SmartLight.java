package com.xworkz.overrided.internal;

    public class SmartLight extends HomeDevice {
        public SmartLight() {
            System.out.println("Smart light is installed and ready");
        }

        @Override
        public void turnOn() {
            System.out.println("Turning on the smart light with adjustable brightness");
        }

        public void changeColor() {
            System.out.println("Changing the light color to blue");
        }
    }
