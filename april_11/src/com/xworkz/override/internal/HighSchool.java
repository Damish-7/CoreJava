package com.xworkz.override.internal;

public class HighSchool extends School {
        public HighSchool() {
            System.out.println("HighSchool: Constructor is running");
        }

        @Override
        public void conductClass() {
            System.out.println("HighSchool: Conducting advanced subject classes");
        }

        public void organizeEvent() {
            System.out.println("HighSchool: Organizing a science exhibition");
        }

        public void assignHomework() {
            System.out.println("HighSchool: Assigning homework to students");
        }
}
