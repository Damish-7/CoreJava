package com.xworkz.encapsulation.internal;

public class KeyChainUser {
    public void test() {
        KeyChain keyChain = new KeyChain();
        keyChain.setMaterial("Metal");
        keyChain.setColor("Black");
        keyChain.setHasTorch(true);
        keyChain.setKeysCount(5);
        keyChain.setWeight(0.15);

        System.out.println("KeyChain Material: " + keyChain.getMaterial());
        System.out.println("Has Torch? " + keyChain.isHasTorch());

        keyChain.shake();
    }
}
