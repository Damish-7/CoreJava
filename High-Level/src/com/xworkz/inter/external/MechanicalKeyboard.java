package com.xworkz.inter.external;

import com.xworkz.inter.internal.rules.Keyboard;

public class MechanicalKeyboard implements Keyboard {
    @Override
    public void type() {
        System.out.println("Typing on mechanical keyboard");
    }

    @Override
    public void pressEnter() {
        System.out.println("Enter key pressed");
    }

    @Override
    public void pressSpace() {
        System.out.println("Spacebar pressed");
    }

    @Override
    public void enableBacklight() {
        System.out.println("Backlight enabled");
    }

    @Override
    public void disableBacklight() {
        System.out.println("Backlight disabled");
    }
}
