package com.xworkz.overrided.internal;

public class Novel extends Book {
    public Novel() {
        System.out.println("A novel is added to the library");
    }

    @Override
    public void read() {
        System.out.println("Reading an interesting novel");
    }

    public void recommend() {
        System.out.println("This novel is a must-read for fans of mystery");
    }
}
