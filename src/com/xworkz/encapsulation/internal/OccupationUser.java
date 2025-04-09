package com.xworkz.encapsulation.internal;

public class OccupationUser {
    public void test() {
        Occupation occupation = new Occupation();
        occupation.setTitle("Software Engineer");
        occupation.setSector("IT");
        occupation.setExperienceYears(5);
        occupation.setRemote(true);
        occupation.setSalary(120000.0);

        System.out.println("Title: " + occupation.getTitle());
        System.out.println("Remote? " + occupation.isRemote());

        occupation.work();
    }
}
