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

        Smartwatch watch = new FitnessWatch();       //9
        watch.showTime();
        watch.trackSteps();
        watch.measureHeartRate();
        watch.startWorkout();
        watch.stopWorkout();
        watch.playMusic();
        watch.stopMusic();
        watch.showNotifications();
        watch.powerOff();

        FitnessWatch myWatch = new FitnessWatch();
        myWatch.showTime();
        myWatch.trackSteps();
        myWatch.measureHeartRate();
        myWatch.startWorkout();
        myWatch.stopWorkout();
        myWatch.playMusic();
        myWatch.stopMusic();
        myWatch.showNotifications();
        myWatch.powerOff();

        Pen pen = new FountainPen();
        pen.write();
        pen.openCap();
        pen.closeCap();
        pen.refillInk();
        pen.changeNib();
        pen.draw();
        pen.highlight();
        pen.eraseInk();
        pen.shake();

        FountainPen myPen = new FountainPen();
        myPen.write();
        myPen.openCap();
        myPen.closeCap();
        myPen.refillInk();
        myPen.changeNib();
        myPen.draw();
        myPen.highlight();
        myPen.eraseInk();
        myPen.shake();


        Fan fan = new CeilingFan();
        fan.turnOn();
        fan.turnOff();
        fan.increaseSpeed();
        fan.decreaseSpeed();
        fan.oscillate();
        fan.reverseRotation();
        fan.cleanBlades();
        fan.setTimer();
        fan.changeMode();

        CeilingFan myFan = new CeilingFan();
        myFan.turnOn();
        myFan.turnOff();
        myFan.increaseSpeed();
        myFan.decreaseSpeed();
        myFan.oscillate();
        myFan.reverseRotation();
        myFan.cleanBlades();
        myFan.setTimer();
        myFan.changeMode();

        TV tv = new SmartTV();
        tv.powerOn();
        tv.powerOff();
        tv.changeChannel();
        tv.increaseVolume();
        tv.decreaseVolume();
        tv.mute();
        tv.nomute();
        tv.openSettings();
        tv.connectToWifi();

        SmartTV myTV = new SmartTV();
        myTV.powerOn();
        myTV.powerOff();
        myTV.changeChannel();
        myTV.increaseVolume();
        myTV.decreaseVolume();
        myTV.mute();
        myTV.nomute();
        myTV.openSettings();
        myTV.connectToWifi();


        Table table = new DiningTable();
        table.placeItem();
        table.removeItem();
        table.fold();
        table.unfold();
        table.dirt();
        table.polish();
        table.move();
        table.checkStability();
        table.adjustHeight();

        DiningTable myTable = new DiningTable();
        myTable.placeItem();
        myTable.removeItem();
        myTable.fold();
        myTable.unfold();
        myTable.dirt();
        myTable.polish();
        myTable.move();
        myTable.checkStability();
        myTable.adjustHeight();










    }

}
