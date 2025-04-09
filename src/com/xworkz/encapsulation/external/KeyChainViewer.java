package com.xworkz.encapsulation.external;


import com.xworkz.encapsulation.internal.KeyChain;

public class KeyChainViewer {
    public void display() {
        KeyChain keyChain = new KeyChain();
        System.out.println("KeyChain Info (read-only):");
        System.out.println("Material: " + keyChain.getMaterial());
        System.out.println("Color: " + keyChain.getColor());
    }
}