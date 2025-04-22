package com.xworkz.inter.external;

import com.xworkz.inter.internal.rules.Hospital;

public class ApolloHospital implements Hospital {
    @Override
    public void clean(){
        System.out.println("running implements in ApolloHospital");
    }
}
