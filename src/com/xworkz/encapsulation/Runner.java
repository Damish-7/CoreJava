package com.xworkz.encapsulation;

import com.xworkz.encapsulation.external.MutantViewer;
import com.xworkz.encapsulation.internal.MutantUser;

public class Runner {

    public static void main(String[] args) {
        MutantUser user = new MutantUser();
        user.test();

        MutantViewer viewer = new MutantViewer();
        viewer.display();
    }
}