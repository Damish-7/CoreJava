package com.xworkz.encapsulation.internal;

public class TankUser {
    public void test() {
        Tank tank = new Tank();
        tank.setModel("T-90");
        tank.setCountry("Russia");
        tank.setCapacity(3);
        tank.setInService(true);
        tank.setWeight(46.5);

        System.out.println("Tank Model: " + tank.getModel());
        System.out.println("Country: " + tank.getCountry());
        System.out.println("In Service? " + tank.isInService());

        tank.fire();
    }
}
