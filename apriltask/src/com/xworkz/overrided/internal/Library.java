package com.xworkz.overrided.internal;

public class Library {
    public Library() {
        System.out.println("Library system is now open");
    }

    public void issueBook() {
        System.out.println("Issuing a physical book to the member");
    }

    public void returnBook() {
        System.out.println("Returning a book to the library");
    }
}
