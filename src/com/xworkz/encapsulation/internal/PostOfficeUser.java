package com.xworkz.encapsulation.internal;

public class PostOfficeUser {
    public void test() {
        PostOffice office = new PostOffice();
        office.setLocation("Downtown");
        office.setHeadPostmaster("Mr. Kumar");
        office.setEmployees(22);
        office.setIsOpen(true);
        office.setArea(350.0);

        System.out.println("Post Office Location: " + office.getLocation());
        System.out.println("Head Postmaster: " + office.getHeadPostmaster());
        System.out.println("Open? " + office.isOpen());

        office.dispatch();
    }
}
