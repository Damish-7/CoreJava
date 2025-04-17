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














    }
}
