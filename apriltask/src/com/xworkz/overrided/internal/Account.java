package com.xworkz.overrided.internal;

public class Account {
    public Account() {
        System.out.println("Bank account is created");
    }

    public void deposit() {
        System.out.println("Depositing money into the account");
    }

    public void withdraw() {
        System.out.println("Withdrawing money from the account");
    }
}
