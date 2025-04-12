package com.xworkz.overrided.internal;

public class SavingsAccount extends Account {
    public SavingsAccount() {
        System.out.println("Savings account setup completed");
    }

    @Override
    public void deposit() {
        System.out.println("Depositing into savings account with interest");
    }

    public void calculateInterest() {
        System.out.println("Calculating interest on the balance");
    }
}