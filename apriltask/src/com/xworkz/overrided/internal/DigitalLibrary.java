package com.xworkz.overrided.internal;


    public class DigitalLibrary extends Library {
        public DigitalLibrary() {
            System.out.println("Digital library setup with e-books");
        }

        @Override
        public void issueBook() {
            System.out.println("Issuing an e-book to the member");
        }

        public void downloadBook() {
            System.out.println("Downloading an e-book to the device");
        }
    }

