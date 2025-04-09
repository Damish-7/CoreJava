package com.xworkz.encapsulation.internal;

public class BadgeUser {
    public void test() {
        Badge badge = new Badge();
        badge.setType("Security");
        badge.setIssuedBy("X-Agency");
        badge.setLevel(5);
        badge.setValid(true);
        badge.setSize(3.2);

        System.out.println("Badge Type: " + badge.getType());
        System.out.println("Issued By: " + badge.getIssuedBy());
        System.out.println("Is Valid? " + badge.isValid());

        badge.scan();
    }
}
