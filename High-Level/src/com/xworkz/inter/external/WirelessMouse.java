package com.xworkz.inter.external;

import com.xworkz.inter.internal.rules.Mouse;

public class WirelessMouse implements Mouse {
    @Override
    public void leftClick() {
        System.out.println("Left click");
    }

    @Override
    public void rightClick() {
        System.out.println("Right click");
    }

    @Override
    public void scroll() {
        System.out.println("Scrolling");
    }

    @Override
    public void doubleClick() {
        System.out.println("Double click");
    }

    @Override
    public void drag() {
        System.out.println("Dragging");
    }
}
