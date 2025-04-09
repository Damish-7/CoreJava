package com.xworkz.encapsulation.internal;

public class GymUser {
    public void test() {
        Gym gym = new Gym();
        gym.setName("PowerHouse");
        gym.setLocation("City Center");
        gym.setTrainers(6);
        gym.setHasSauna(true);
        gym.setMembershipFee(999.99);

        System.out.println("Gym Name: " + gym.getName());
        System.out.println("Location: " + gym.getLocation());
        System.out.println("Has Sauna? " + gym.hasSauna());

        gym.workout();
    }
}
