package com.xworkz.overrided.internal;

public class Account {
    private String name;
    private int id;

    public Account(String name,int id) {
        System.out.println("Bank account is created");
    }

    public void deposit() {
        System.out.println("Depositing money into the account");
    }

    public void withdraw() {
        System.out.println("Withdrawing money from the account");
    }
    @Override
    public String toString(){
        return "Account name"+name+"Bank_id id"+id;
    }
}
