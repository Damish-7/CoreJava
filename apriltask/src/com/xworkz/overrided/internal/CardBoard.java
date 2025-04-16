package com.xworkz.overrided.internal;

public class CardBoard extends PaperBox{
    public CardBoard() {
    System.out.println("to keep product");
}

    @Override
    public void KeepOn() {
        System.out.println("To store");
    }

    public void PLaceIt() {
        System.out.println("To handle ");
    }
}