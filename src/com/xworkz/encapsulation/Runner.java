package com.xworkz.encapsulation;

import com.xworkz.encapsulation.external.MutantViewer;
import com.xworkz.encapsulation.internal.MutantUser;

import com.xworkz.encapsulation.internal.KeyChainUser;
import com.xworkz.encapsulation.external.KeyChainViewer;

import com.xworkz.encapsulation.internal.TankUser;
import com.xworkz.encapsulation.external.TankViewer;

import com.xworkz.encapsulation.internal.BadgeUser;
import com.xworkz.encapsulation.external.BadgeViewer;

import com.xworkz.encapsulation.internal.PostOfficeUser;
import com.xworkz.encapsulation.external.PostOfficeViewer;

import com.xworkz.encapsulation.internal.OccupationUser;
import com.xworkz.encapsulation.external.OccupationViewer;

import com.xworkz.encapsulation.internal.JetUser;
import com.xworkz.encapsulation.external.JetViewer;

import com.xworkz.encapsulation.internal.GarageUser;
import com.xworkz.encapsulation.external.GarageViewer;

import com.xworkz.encapsulation.internal.GymUser;
import com.xworkz.encapsulation.external.GymViewer;

import com.xworkz.encapsulation.internal.ApartmentUser;
import com.xworkz.encapsulation.external.ApartmentViewer;

public class Runner {

    public static void main(String[] args) {
        MutantUser user = new MutantUser();
        user.test();

        MutantViewer viewer = new MutantViewer();
        viewer.display();

        KeyChainUser user1 = new KeyChainUser();
        user1.test();

        KeyChainViewer viewer1 = new KeyChainViewer();
        viewer1.display();

        TankUser user2 = new TankUser();
        user2.test();

        TankViewer viewer2 = new TankViewer();
        viewer2.display();

        BadgeUser user3 = new BadgeUser();
        user3.test();

        BadgeViewer viewer3 = new BadgeViewer();
        viewer3.display();

        PostOfficeUser user4 = new PostOfficeUser();
        user4.test();

        PostOfficeViewer viewer4 = new PostOfficeViewer();
        viewer4.display();

        OccupationUser user5 = new OccupationUser();
        user5.test();

        OccupationViewer viewer5 = new OccupationViewer();
        viewer5.display();

        JetUser user6 = new JetUser();
        user6.test();

        JetViewer viewer6 = new JetViewer();
        viewer6.display();

        GarageUser user7 = new GarageUser();
        user7.test();

        GarageViewer viewer7 = new GarageViewer();
        viewer7.display();

        GymUser user8 = new GymUser();
        user8.test();

        GymViewer viewer8 = new GymViewer();
        viewer8.display();

        ApartmentUser user9 = new ApartmentUser();
        user9.test();

        ApartmentViewer viewer9 = new ApartmentViewer();
        viewer9.display();

    }
}




