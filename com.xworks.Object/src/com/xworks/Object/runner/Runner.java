package com.xworks.Object.runner;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import com.xworks.Object.internal.*;

public class Runner {
    public static void main(String[] args) {

        Pen pen1 = new Pen("doms", 20, "ball", "plastic");
        Pen pen2 = new Pen("oracle", 15, "gel", "metal");
        Pen pen3 = new Pen("doms", 20, "ball", "plastic");

        boolean isSame = pen1.equals(pen3);
        boolean notMatch = pen3.equals(pen2);
        System.out.println("pen1 and pen3 match: " + isSame);
        System.out.println("pen1 and pen2 match: " + notMatch);


        Book book1 = new Book("The Alchemist", "Paulo Coelho", 300, "Fiction");
        Book book2 = new Book("Deep Work", "Cal Newport", 400, "Productivity");
        Book book3 = new Book("The Alchemist", "Paulo Coelho", 300, "Fiction");

        boolean isSameBook = book1.equals(book3);
        boolean notSameBook = book1.equals(book2);
        System.out.println("book1 and book3 match: " + isSameBook);
        System.out.println("book1 and book2 match: " + notSameBook);


        Laptop laptop1 = new Laptop("Dell", "i5", 60000, "Black");
        Laptop laptop2 = new Laptop("HP", "i7", 75000, "Silver");
        Laptop laptop3 = new Laptop("Dell", "i5", 60000, "Black");

        boolean isSameLaptop = laptop1.equals(laptop3);
        boolean notSameLaptop = laptop1.equals(laptop2);
        System.out.println("laptop1 and laptop3 match: " + isSameLaptop);
        System.out.println("laptop1 and laptop2 match: " + notSameLaptop);

        Mobile mobile1 = new Mobile("Samsung", "Galaxy A52", 25000, "Android");
        Mobile mobile2 = new Mobile("Apple", "iPhone 13", 60000, "iOS");
        Mobile mobile3 = new Mobile("Samsung", "Galaxy A52", 25000, "Android");

        boolean isSameMobile = mobile1.equals(mobile3);
        boolean notSameMobile = mobile1.equals(mobile2);
        System.out.println("mobile1 and mobile3 match: " + isSameMobile);
        System.out.println("mobile1 and mobile2 match: " + notSameMobile);


        Watch watch1 = new Watch("Fossil", "Analog", 5000, "Leather");
        Watch watch2 = new Watch("Casio", "Digital", 3500, "Resin");
        Watch watch3 = new Watch("Fossil", "Analog", 5000, "Leather");

        boolean isSameWatch = watch1.equals(watch3);
        boolean notSameWatch = watch1.equals(watch2);
        System.out.println("watch1 and watch3 match: " + isSameWatch);
        System.out.println("watch1 and watch2 match: " + notSameWatch);


        Bag bag1 = new Bag("Skybags", "Blue", 2000, "Medium");
        Bag bag2 = new Bag("American Tourister", "Black", 2500, "Large");
        Bag bag3 = new Bag("Skybags", "Blue", 2000, "Medium");

        boolean isSameBag = bag1.equals(bag3);
        boolean notSameBag = bag1.equals(bag2);

        System.out.println("bag1 and bag3 match: " + isSameBag);
        System.out.println("bag1 and bag2 match: " + notSameBag);


        Bottle bottle1 = new Bottle("Milton", "Green", 300, "Steel");
        Bottle bottle2 = new Bottle("Cello", "Red", 250, "Plastic");
        Bottle bottle3 = new Bottle("Milton", "Green", 300, "Steel");

        boolean isSameBottle = bottle1.equals(bottle3);
        boolean notSameBottle = bottle1.equals(bottle2);
        System.out.println("bottle1 and bottle3 match: " + isSameBottle);
        System.out.println("bottle1 and bottle2 match: " + notSameBottle);


        Shoe shoe1 = new Shoe("Nike", "Running", 4500, "9");
        Shoe shoe2 = new Shoe("Adidas", "Sneakers", 4000, "8");
        Shoe shoe3 = new Shoe("Nike", "Running", 4500, "9");

        boolean isSameShoes = shoe1.equals(shoe3);
        boolean notSameShoes = shoe1.equals(shoe2);
        System.out.println("shoe1 and shoe3 match: " + isSameShoes);
        System.out.println("shoe1 and shoe2 match: " + notSameShoes);


        Chair chair1 = new Chair("Godrej", "Plastic", 1200, "Black");
        Chair chair2 = new Chair("Nilkamal", "Wood", 2200, "Brown");
        Chair chair3 = new Chair("Godrej", "Plastic", 1200, "Black");

        boolean isSameChair = chair1.equals(chair3);
        boolean notSameChair = chair1.equals(chair2);
        System.out.println("chair1 and chair3 match: " + isSameChair);
        System.out.println("chair1 and chair2 match: " + notSameChair);


        Fan fan1 = new Fan("Usha", "Ceiling", 1800, "White");
        Fan fan2 = new Fan("Havells", "Table", 2200, "Grey");
        Fan fan3 = new Fan("Usha", "Ceiling", 1800, "White");

        boolean isSameFan = fan1.equals(fan3);
        boolean notSameFan = fan1.equals(fan2);
        System.out.println("fan1 and fan3 match: " + isSameFan);
        System.out.println("fan1 and fan2 match: " + notSameFan);


        TV tv1 = new TV("Sony", "LED", 40000, "43 inch");
        TV tv2 = new TV("Samsung", "QLED", 55000, "50 inch");
        TV tv3 = new TV("Sony", "LED", 40000, "43 inch");

        boolean isSameTV = tv1.equals(tv3);
        boolean notSameTV = tv1.equals(tv2);
        System.out.println("tv1 and tv3 match: " + isSameTV);
        System.out.println("tv1 and tv2 match: " + notSameTV);


        Speaker speaker1 = new Speaker("JBL", "Bluetooth", 3000, "Wireless");
        Speaker speaker2 = new Speaker("Boat", "Wired", 1500, "Aux");
        Speaker speaker3 = new Speaker("JBL", "Bluetooth", 3000, "Wireless");

        boolean isSameSpeaker = speaker1.equals(speaker3);
        boolean notSameSpeaker = speaker1.equals(speaker2);
        System.out.println("speaker1 and speaker3 match: " + isSameSpeaker);
        System.out.println("speaker1 and speaker2 match: " + notSameSpeaker);


        Table table1 = new Table("Ikea", "Wood", 7000, "Round");
        Table table2 = new Table("Godrej", "Metal", 9000, "Rectangle");
        Table table3 = new Table("Ikea", "Wood", 7000, "Round");

        boolean isSameTable = table1.equals(table3);
        boolean notSameTable = table1.equals(table2);
        System.out.println("table1 and table3 match: " + isSameTable);
        System.out.println("table1 and table2 match: " + notSameTable);


        Keyboard keyboard1 = new Keyboard("Logitech", "Mechanical", 2500, "Wireless");
        Keyboard keyboard2 = new Keyboard("HP", "Membrane", 1200, "Wired");
        Keyboard keyboard3 = new Keyboard("Logitech", "Mechanical", 2500, "Wireless");

        boolean isSameKeyboard = keyboard1.equals(keyboard3);
        boolean notSameKeyboard = keyboard1.equals(keyboard2);
        System.out.println("keyboard1 and keyboard3 match: " + isSameKeyboard);
        System.out.println("keyboard1 and keyboard2 match: " + notSameKeyboard);


        Monitor monitor1 = new Monitor("Dell", "1080p", 15000, "24 inch");
        Monitor monitor2 = new Monitor("LG", "4K", 25000, "27 inch");
        Monitor monitor3 = new Monitor("Dell", "1080p", 15000, "24 inch");

        boolean isSameMonitor = monitor1.equals(monitor3);
        boolean notSameMonitor = monitor1.equals(monitor2);
        System.out.println("monitor1 and monitor3 match: " + isSameMonitor);
        System.out.println("monitor1 and monitor2 match: " + notSameMonitor);


        Mouse mouse1 = new Mouse("Logitech", "Optical", 800, "Wireless");
        Mouse mouse2 = new Mouse("Dell", "Laser", 600, "Wired");
        Mouse mouse3 = new Mouse("Logitech", "Optical", 800, "Wireless");

        boolean isSameMouse = mouse1.equals(mouse3);
        boolean notSameMouse = mouse1.equals(mouse2);
        System.out.println("mouse1 and mouse3 match: " + isSameMouse);
        System.out.println("mouse1 and mouse2 match: " + notSameMouse);


        Camera camera1 = new Camera("Canon", "DSLR", 45000, "24MP");
        Camera camera2 = new Camera("Nikon", "Mirrorless", 60000, "30MP");
        Camera camera3 = new Camera("Canon", "DSLR", 45000, "24MP");

        boolean isSameCamera = camera1.equals(camera3);
        boolean notSameCamera = camera1.equals(camera2);
        System.out.println("camera1 and camera3 match: " + isSameCamera);
        System.out.println("camera1 and camera2 match: " + notSameCamera);


        Fridge fridge1 = new Fridge("LG", "260L", 22000, "Double Door");
        Fridge fridge2 = new Fridge("Samsung", "300L", 28000, "Single Door");
        Fridge fridge3 = new Fridge("LG", "260L", 22000, "Double Door");

        boolean isSameFridge = fridge1.equals(fridge3);
        boolean notSameFridge = fridge1.equals(fridge2);
        System.out.println("fridge1 and fridge3 match: " + isSameFridge);
        System.out.println("fridge1 and fridge2 match: " + notSameFridge);


        AC ac1 = new AC("Daikin", "Split", 45000, "1.5 Ton");
        AC ac2 = new AC("Voltas", "Window", 35000, "1 Ton");
        AC ac3 = new AC("Daikin", "Split", 45000, "1.5 Ton");

        boolean isSameAC = ac1.equals(ac3);
        boolean notSameAC = ac1.equals(ac2);
        System.out.println("ac1 and ac3 match: " + isSameAC);
        System.out.println("ac1 and ac2 match: " + notSameAC);


        Bike bike1 = new Bike("Yamaha", "R15", 150000, "V2");
        Bike bike2 = new Bike("Honda", "CBR", 180000, "V4");
        Bike bike3 = new Bike("Yamaha", "R15", 150000, "V2");

        boolean isSameBike = bike1.equals(bike3);
        boolean notSameBike = bike1.equals(bike2);
        System.out.println("bike1 and bike3 match: " + isSameBike);
        System.out.println("bike1 and bike2 match: " + notSameBike);


        Headphones headphones1 = new Headphones("Sony", "Over-Ear", 3000, "Black");
        Headphones headphones2 = new Headphones("Bose", "In-Ear", 8000, "White");
        Headphones headphones3 = new Headphones("Sony", "Over-Ear", 3000, "Black");

        boolean isSameHeadphones = headphones1.equals(headphones3);
        boolean notSameHeadphones = headphones1.equals(headphones2);
        System.out.println("headphones1 and headphones3 match: " + isSameHeadphones);
        System.out.println("headphones1 and headphones2 match: " + notSameHeadphones);


        WashingMachine wm1 = new WashingMachine("LG", "Front Load", 35000, "7 kg");
        WashingMachine wm2 = new WashingMachine("Samsung", "Top Load", 25000, "8 kg");
        WashingMachine wm3 = new WashingMachine("LG", "Front Load", 35000, "7 kg");

        boolean isSameWM = wm1.equals(wm3);
        boolean notSameWM = wm1.equals(wm2);
        System.out.println("wm1 and wm3 match: " + isSameWM);
        System.out.println("wm1 and wm2 match: " + notSameWM);


        Microwave microwave1 = new Microwave("Samsung", "Convection", 15000, "25L");
        Microwave microwave2 = new Microwave("LG", "Solo", 12000, "20L");
        Microwave microwave3 = new Microwave("Samsung", "Convection", 15000, "25L");

        boolean isSameMicrowave = microwave1.equals(microwave3);
        boolean notSameMicrowave = microwave1.equals(microwave2);
        System.out.println("microwave1 and microwave3 match: " + isSameMicrowave);
        System.out.println("microwave1 and microwave2 match: " + notSameMicrowave);


        Smartphone phone1 = new Smartphone("Apple", "iPhone 14", 79999, "128GB");
        Smartphone phone2 = new Smartphone("Samsung", "Galaxy S21", 74999, "128GB");
        Smartphone phone3 = new Smartphone("Apple", "iPhone 14", 79999, "128GB");

        boolean isSamePhone = phone1.equals(phone3);
        boolean notSamePhone = phone1.equals(phone2);
        System.out.println("phone1 and phone3 match: " + isSamePhone);
        System.out.println("phone1 and phone2 match: " + notSamePhone);


        Drone drone1 = new Drone("DJI", "Mavic Pro", 80000, "4K");
        Drone drone2 = new Drone("Parrot", "Anafi", 60000, "4K");
        Drone drone3 = new Drone("DJI", "Mavic Pro", 80000, "4K");

        boolean isSameDrone = drone1.equals(drone3);
        boolean notSameDrone = drone1.equals(drone2);
        System.out.println("drone1 and drone3 match: " + isSameDrone);
        System.out.println("drone1 and drone2 match: " + notSameDrone);


        SmartWatch Watch1 = new SmartWatch("Apple", "Series 7", 39999, "Space Gray");
        SmartWatch Watch2 = new SmartWatch("Samsung", "Galaxy Watch 4", 25000, "Black");
        SmartWatch Watch3 = new SmartWatch("Apple", "Series 7", 39999, "Space Gray");

        boolean isSamewatch = watch1.equals(watch3);
        boolean notSamewatch = watch1.equals(watch2);
        System.out.println("watch1 and watch3 match: " + isSameWatch);
        System.out.println("watch1 and watch2 match: " + notSameWatch);



                Window window1 = new Window();
                window1.setWindow("Wood", "Sliding", "Brown", 120);

                Window window2 = new Window();
                window2.setWindow("Aluminum", "Casement", "White", 150);

                Window window3 = new Window();
                window3.setWindow("Wood", "Sliding", "Brown", 120);

                boolean match1 = window1.equals(window3);
                boolean match2 = window1.equals(window2);

                System.out.println("window1 and window3 match: " + match1);
                System.out.println("window1 and window2 match: " + match2);


        Helmet helmet1 = new Helmet();
        helmet1.setHelmet("Vega", "Full-face", "Black", 58);

        Helmet helmet2 = new Helmet();
        helmet2.setHelmet("Steelbird", "Open-face", "Red", 60);

        Helmet helmet3 = new Helmet();
        helmet3.setHelmet("Vega", "Full-face", "Black", 58);

        boolean match3 = helmet1.equals(helmet3);
        boolean match4 = helmet1.equals(helmet2);

        System.out.println("helmet1 and helmet3 match: " + match3);
        System.out.println("helmet1 and helmet2 match: " + match4);

        Mirror mirror1 = new Mirror();
        mirror1.setMirror("Round", "Wood", "Medium", 1500);

        Mirror mirror2 = new Mirror();
        mirror2.setMirror("Square", "Plastic", "Large", 1800);

        Mirror mirror3 = new Mirror();
        mirror3.setMirror("Round", "Wood", "Medium", 1500);

        boolean match5 = mirror1.equals(mirror3);
        boolean match6 = mirror1.equals(mirror2);

        System.out.println("mirror1 and mirror3 match: " + match5);
        System.out.println("mirror1 and mirror2 match: " + match6);

        Backpack backpack1 = new Backpack();
        backpack1.setBackpack("Wildcraft", "Blue", "Nylon", 30);

        Backpack backpack2 = new Backpack();
        backpack2.setBackpack("American Tourister", "Black", "Polyester", 35);

        Backpack backpack3 = new Backpack();
        backpack3.setBackpack("Wildcraft", "Blue", "Nylon", 30);

        boolean match7 = backpack1.equals(backpack3);
        boolean match8 = backpack1.equals(backpack2);

        System.out.println("backpack1 and backpack3 match: " + match7);
        System.out.println("backpack1 and backpack2 match: " + match8);

        Phone phone4 = new Phone();
        phone4.setPhone("Apple", "iPhone 14", "Black", 128);

        Phone phone5 = new Phone();
        phone5.setPhone("Samsung", "Galaxy S22", "Blue", 256);

        Phone phone6 = new Phone();
        phone6.setPhone("Apple", "iPhone 14", "Black", 128);

        boolean match9 = phone1.equals(phone3);
        boolean match0 = phone1.equals(phone2);

        System.out.println("phone1 and phone3 match: " + match9);
        System.out.println("phone1 and phone2 match: " + match0);

        Lamp lamp1 = new Lamp();
        lamp1.setLamp("Philips", "Table", "White", 800);

        Lamp lamp2 = new Lamp();
        lamp2.setLamp("Crompton", "Floor", "Yellow", 600);

        Lamp lamp3 = new Lamp();
        lamp3.setLamp("Philips", "Table", "White", 800);

        boolean match11 = lamp1.equals(lamp3);
        boolean match12 = lamp1.equals(lamp2);

        System.out.println("lamp1 and lamp3 match: " + match11);
        System.out.println("lamp1 and lamp2 match: " + match12);

        Curtain curtain1 = new Curtain();
        curtain1.setCurtain("Cotton", "Blue", "Striped", 120);

        Curtain curtain2 = new Curtain();
        curtain2.setCurtain("Silk", "Red", "Floral", 150);

        Curtain curtain3 = new Curtain();
        curtain3.setCurtain("Cotton", "Blue", "Striped", 120);

        boolean match13 = curtain1.equals(curtain3);
        boolean match14 = curtain1.equals(curtain2);

        System.out.println("curtain1 and curtain3 match: " + match13);
        System.out.println("curtain1 and curtain2 match: " + match14);


        Bicycle bicycle1 = new Bicycle();
        bicycle1.setBicycle("Trek", "Red", 21, 26);

        Bicycle bicycle2 = new Bicycle();
        bicycle2.setBicycle("Schwinn", "Blue", 18, 24);

        Bicycle bicycle3 = new Bicycle();
        bicycle3.setBicycle("Trek", "Red", 21, 26);

        boolean match15= bicycle1.equals(bicycle3);
        boolean match16= bicycle1.equals(bicycle2);

        System.out.println("bicycle1 and bicycle3 match: " + match15);
        System.out.println("bicycle1 and bicycle2 match: " + match16);


        Television tv4 = new Television();
        tv4.setTelevision("Samsung", "LED", 55, true);

        Television tv5 = new Television();
        tv5.setTelevision("LG", "OLED", 65, true);

        Television tv6 = new Television();
        tv6.setTelevision("Samsung", "LED", 55, true);

        boolean match17 = tv1.equals(tv3);
        boolean match18= tv1.equals(tv2);

        System.out.println("tv1 and tv3 match: " + match17);
        System.out.println("tv1 and tv2 match: " + match18);


        Flashlight flashlight1 = new Flashlight();
        flashlight1.setFlashlight("Maglite", "LED", 800, true);

        Flashlight flashlight2 = new Flashlight();
        flashlight2.setFlashlight("Energizer", "Incandescent", 400, false);

        Flashlight flashlight3 = new Flashlight();
        flashlight3.setFlashlight("Maglite", "LED", 800, true);

        boolean match19 = flashlight1.equals(flashlight3);
        boolean match20 = flashlight1.equals(flashlight2);

        System.out.println("flashlight1 and flashlight3 match: " + match19);
        System.out.println("flashlight1 and flashlight2 match: " + match20);


        Charger charger1 = new Charger();
        charger1.setCharger("Samsung", "USB-C", 25, true);

        Charger charger2 = new Charger();
        charger2.setCharger("Apple", "Lightning", 20, true);

        Charger charger3 = new Charger();
        charger3.setCharger("Samsung", "USB-C", 25, true);

        System.out.println("charger1: " + charger1);
        System.out.println("charger2: " + charger2);
        System.out.println("charger3: " + charger3);

        boolean match21 = charger1.equals(charger3);
        boolean match22 = charger1.equals(charger2);

        System.out.println("charger1 and charger3 match: " + match21);
        System.out.println("charger1 and charger2 match: " + match22);

        Projector projector1 = new Projector();
        projector1.setProjector("Epson", "1080p", 3500, true);

        Projector projector2 = new Projector();
        projector2.setProjector("BenQ", "4K", 3000, false);

        Projector projector3 = new Projector();
        projector3.setProjector("Epson", "1080p", 3500, true);

        System.out.println("projector1: " + projector1);
        System.out.println("projector2: " + projector2);
        System.out.println("projector3: " + projector3);

        boolean match23 = projector1.equals(projector3);
        boolean match24 = projector1.equals(projector2);

        System.out.println("projector1 and projector3 match: " + match23);
        System.out.println("projector1 and projector2 match: " + match24);

        Router router1 = new Router();
        router1.setRouter("TP-Link", "Archer C6", 1200, true);

        Router router2 = new Router();
        router2.setRouter("Netgear", "Nighthawk", 1800, true);

        Router router3 = new Router();
        router3.setRouter("TP-Link", "Archer C7", 1200, false);

        System.out.println("router1: " + router1);
        System.out.println("router2: " + router2);
        System.out.println("router3: " + router3);

        boolean match25 = router1.equals(router3);
        boolean match26 = router1.equals(router2);

        System.out.println("router1 and router3 match: " + match25);
        System.out.println("router1 and router2 match: " + match26);


        Printer printer1 = new Printer();
        printer1.setPrinter("HP", "Laser", 250.0, true);

        Printer printer2 = new Printer();
        printer2.setPrinter("Canon", "Inkjet", 150.0, false);

        Printer printer3 = new Printer();
        printer3.setPrinter("HP", "Laser", 300.0, true);

        System.out.println("printer1: " + printer1);
        System.out.println("printer2: " + printer2);
        System.out.println("printer3: " + printer3);

        boolean match27 = printer1.equals(printer3);
        boolean match28 = printer1.equals(printer2);

        System.out.println("printer1 and printer3 match: " + match27);
        System.out.println("printer1 and printer2 match: " + match28);


        Battery battery1 = new Battery();
        battery1.setBattery("Duracell", "Li-ion", 2000, true);

        Battery battery2 = new Battery();
        battery2.setBattery("Energizer", "NiMH", 1500, false);

        Battery battery3 = new Battery();
        battery3.setBattery("Duracell", "Li-ion", 2000, true);

        System.out.println("battery1: " + battery1);
        System.out.println("battery2: " + battery2);
        System.out.println("battery3: " + battery3);

        boolean match29 = battery1.equals(battery3);
        boolean match30 = battery1.equals(battery2);

        System.out.println("battery1 and battery3 match: " + match29);
        System.out.println("battery1 and battery2 match: " + match30);

        AirConditioner ac4 = new AirConditioner();
        ac4.setAirConditioner("Daikin", "FTKM60", 18000, true);

        AirConditioner ac5 = new AirConditioner();
        ac5.setAirConditioner("Samsung", "AR12", 12000, false);

        AirConditioner ac6 = new AirConditioner();
        ac6.setAirConditioner("Daikin", "FTKM60", 18000, true);

        System.out.println("ac1: " + ac1);
        System.out.println("ac2: " + ac2);
        System.out.println("ac3: " + ac3);

        boolean match31 = ac1.equals(ac3);
        boolean match32 = ac1.equals(ac2);

        System.out.println("ac1 and ac3 match: " + match31);
        System.out.println("ac1 and ac2 match: " + match32);


        Dress dress1 = new Dress();
        dress1.setDress("Zara", "Red", "M", "Cotton");

        Dress dress2 = new Dress();
        dress2.setDress("H&M", "Blue", "L", "Silk");

        Dress dress3 = new Dress();
        dress3.setDress("Zara", "Red", "M", "Cotton");

        System.out.println("dress1: " + dress1);
        System.out.println("dress2: " + dress2);
        System.out.println("dress3: " + dress3);

        boolean match33 = dress1.equals(dress3);
        boolean match34 = dress1.equals(dress2);

        System.out.println("dress1 and dress3 match: " + match33);
        System.out.println("dress1 and dress2 match: " + match34);


        Tool tool1 = new Tool();
        tool1.setTool("Hammer", "Bosch", 1.5, false);

        Tool tool2 = new Tool();
        tool2.setTool("Drill", "Makita", 2.3, true);

        Tool tool3 = new Tool();
        tool3.setTool("Hammer", "Bosch", 1.5, false);

        System.out.println("tool1: " + tool1);
        System.out.println("tool2: " + tool2);
        System.out.println("tool3: " + tool3);

        boolean match35 = tool1.equals(tool3);
        boolean match36 = tool1.equals(tool2);

        System.out.println("tool1 and tool3 match: " + match35);
        System.out.println("tool1 and tool2 match: " + match36);


        Glass glass1 = new Glass();
        glass1.setGlass("Glass", "Clear", 350, true);

        Glass glass2 = new Glass();
        glass2.setGlass("Plastic", "Blue", 250, false);

        Glass glass3 = new Glass();
        glass3.setGlass("Glass", "Clear", 350, true);

        System.out.println("glass1: " + glass1);
        System.out.println("glass2: " + glass2);
        System.out.println("glass3: " + glass3);

        boolean match37 = glass1.equals(glass3);
        boolean match38 = glass1.equals(glass2);

        System.out.println("glass1 and glass3 match: " + match37);
        System.out.println("glass1 and glass2 match: " + match38);


        Plate plate1 = new Plate();
        plate1.setPlate("Ceramic", "White", 28, true);

        Plate plate2 = new Plate();
        plate2.setPlate("Plastic", "Blue", 22, false);

        Plate plate3 = new Plate();
        plate3.setPlate("Ceramic", "White", 28, true);

        System.out.println("plate1: " + plate1);
        System.out.println("plate2: " + plate2);
        System.out.println("plate3: " + plate3);

        boolean match39= plate1.equals(plate3);
        boolean match40 = plate1.equals(plate2);

        System.out.println("plate1 and plate3 match: " + match39);
        System.out.println("plate1 and plate2 match: " + match40);

        Soap soap1 = new Soap();
        soap1.setSoap("Dove", "Lavender", 100, true);

        Soap soap2 = new Soap();
        soap2.setSoap("Lux", "Rose", 150, false);

        Soap soap3 = new Soap();
        soap3.setSoap("Dove", "Lavender", 100, true);

        System.out.println("soap1: " + soap1);
        System.out.println("soap2: " + soap2);
        System.out.println("soap3: " + soap3);

        boolean match41 = soap1.equals(soap3);
        boolean match42 = soap1.equals(soap2);

        System.out.println("soap1 and soap3 match: " + match41);
            System.out.println("soap1 and soap2 match: " + match42);


        Wire wire1 = new Wire();
        wire1.setWire("Copper", 5.0, "Red", true);

        Wire wire2 = new Wire();
        wire2.setWire("Fiber", 10.0, "Blue", false);

        Wire wire3 = new Wire();
        wire3.setWire("Copper", 5.0, "Red", true);

        System.out.println("wire1: " + wire1);
        System.out.println("wire2: " + wire2);
        System.out.println("wire3: " + wire3);

        boolean match43 = wire1.equals(wire3);
        boolean match44 = wire1.equals(wire2);

        System.out.println("wire1 and wire3 match: " + match43);
        System.out.println("wire1 and wire2 match: " + match44);


        Mug mug1 = new Mug();
        mug1.setMug("Ceramic", "Printed", 350, true);

        Mug mug2 = new Mug();
        mug2.setMug("Glass", "Plain", 300, false);

        Mug mug3 = new Mug();
        mug3.setMug("Ceramic", "Printed", 350, true);

        System.out.println("mug1: " + mug1);
        System.out.println("mug2: " + mug2);
        System.out.println("mug3: " + mug3);

        boolean match45 = mug1.equals(mug3);
        boolean match46 = mug1.equals(mug2);

        System.out.println("mug1 and mug3 match: " + match45);
        System.out.println("mug1 and mug2 match: " + match46);


        Notebook notebook1 = new Notebook();
        notebook1.setNotebook("Classmate", 200, "A4", true);

        Notebook notebook2 = new Notebook();
        notebook2.setNotebook("Navneet", 150, "A5", false);

        Notebook notebook3 = new Notebook();
        notebook3.setNotebook("Classmate", 200, "A4", true);

        System.out.println("notebook1: " + notebook1);
        System.out.println("notebook2: " + notebook2);
        System.out.println("notebook3: " + notebook3);

        boolean match47= notebook1.equals(notebook3);
        boolean match48= notebook1.equals(notebook2);

        System.out.println("notebook1 and notebook3 match: " + match47);
        System.out.println("notebook1 and notebook2 match: " + match48);


        Cap cap1 = new Cap();
        cap1.setCap("Nike", "Black", "Cotton", true);

        Cap cap2 = new Cap();
        cap2.setCap("Adidas", "Blue", "Polyester", false);

        Cap cap3 = new Cap();
        cap3.setCap("Nike", "Black", "Cotton", true);

        System.out.println("cap1: " + cap1);
        System.out.println("cap2: " + cap2);
        System.out.println("cap3: " + cap3);

        boolean match49= cap1.equals(cap3);
        boolean match50= cap1.equals(cap2);

        System.out.println("cap1 and cap3 match: " + match49);
        System.out.println("cap1 and cap2 match: " + match50);




    }
}
