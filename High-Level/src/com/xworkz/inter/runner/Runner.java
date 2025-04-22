package com.xworkz.inter.runner;

import com.xworkz.inter.external.*;
import com.xworkz.inter.internal.rules.*;

public class Runner {
    public static void main(String[] args){
        Hospital hospital=new ApolloHospital();            //1
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


        CoffeeMachine coffeeMachine = new EspressoMachine();     //7
        coffeeMachine.start();
        coffeeMachine.addWater();
        coffeeMachine.addCoffee();
        coffeeMachine.brew();
        coffeeMachine.setTimer();
        coffeeMachine.clean();
        coffeeMachine.stop();

        EspressoMachine myCoffeeMachine = new EspressoMachine();
        myCoffeeMachine.start();
        myCoffeeMachine.addWater();
        myCoffeeMachine.addCoffee();
        myCoffeeMachine.brew();
        myCoffeeMachine.setTimer();
        myCoffeeMachine.clean();
        myCoffeeMachine.stop();


        WashingMachine washingMachine = new LGWashingMachine();
        washingMachine.start();
        washingMachine.addDetergent();
        washingMachine.wash();
        washingMachine.rinse();
        washingMachine.spin();
        washingMachine.clean();
        washingMachine.stop();

        LGWashingMachine myWasher = new LGWashingMachine();
        myWasher.start();
        myWasher.addDetergent();
        myWasher.wash();
        myWasher.rinse();
        myWasher.spin();
        myWasher.clean();
        myWasher.stop();

        Printer printer = new HPPrinter();
        printer.powerOn();
        printer.loadPaper();
        printer.print();
        printer.scan();
        printer.copy();
        printer.clean();
        printer.powerOff();

        HPPrinter myPrinter = new HPPrinter();
        myPrinter.powerOn();
        myPrinter.loadPaper();
        myPrinter.print();
        myPrinter.scan();
        myPrinter.copy();
        myPrinter.clean();
        myPrinter.powerOff();


        Microwave microwave = new SamsungMicrowave();
        microwave.powerOn();
        microwave.setTemperature();
        microwave.setTimer();
        microwave.startCooking();
        microwave.stopCooking();
        microwave.clean();
        microwave.powerOff();


        SamsungMicrowave myMicrowave = new SamsungMicrowave();
        myMicrowave.powerOn();
        myMicrowave.setTemperature();
        myMicrowave.setTimer();
        myMicrowave.startCooking();
        myMicrowave.stopCooking();
        myMicrowave.clean();
        myMicrowave.powerOff();


        AirConditioner ac = new DaikinAirConditioner();
        ac.turnOn();
        ac.setTemperature();
        ac.swing();
        ac.increaseFanSpeed();
        ac.decreaseFanSpeed();
        ac.degree();
        ac.turnOff();

        DaikinAirConditioner myAC = new DaikinAirConditioner();
        myAC.turnOn();
        myAC.setTemperature();
        myAC.swing();
        myAC.increaseFanSpeed();
        myAC.decreaseFanSpeed();
        myAC.degree();
        myAC.turnOff();








    }

}
