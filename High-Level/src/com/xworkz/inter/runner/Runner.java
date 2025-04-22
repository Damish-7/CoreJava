package com.xworkz.inter.runner;

import com.xworkz.inter.external.*;
import com.xworkz.inter.internal.rules.*;

public class Runner {
    public static void main(String[] args){
        Hospital hospital=new ApolloHospital();
        hospital.clean();
        ApolloHospital apolloHospital=new ApolloHospital();
        apolloHospital.clean();

        School school=new RotarySchool();
        school.teach();
        RotarySchool rotarySchool=new RotarySchool();
        rotarySchool.teach();

        College college=new NehruCollege();
        college.study();
        NehruCollege nehruCollege=new NehruCollege();
        nehruCollege.study();

        Office office=new PostOffice();
        office.work();
        PostOffice postOffice=new PostOffice();
        postOffice.work();

        Company company=new WiproCompany();
        company.dedicate();
        WiproCompany wiproCompany=new WiproCompany();
        wiproCompany.dedicate();




    }

}
