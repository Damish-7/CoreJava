package com.xworkz.encapsulation.external;

import com.xworkz.encapsulation.internal.PostOffice;

public class PostOfficeViewer {
    public void display() {
        PostOffice office = new PostOffice();
        System.out.println("Post Office Info (read-only):");
        System.out.println("Location: " + office.getLocation());
        System.out.println("Postmaster: " + office.getHeadPostmaster());
    }
}
