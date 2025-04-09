package com.xworkz.inheritance.Runner;

import com.xworkz.inheritance.external.NikeShoe;
import com.xworkz.inheritance.internal.PumaShoe;

public class ShoeRunner {
    public static void main(String[] args){
        NikeShoe nikeshoe=new NikeShoe();
        NikeShoe.use();

        PumaShoe pumaShoe=new PumaShoe();
        PumaShoe.uses();
    }

}
