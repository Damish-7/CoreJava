package com.xworkz.overrided.runner;

import com.xworkz.overrided.internal.*;


public class runner {
    public static void main(String[] args){

        Generator generator=new Inverter();
        generator.motor();

        Inverter inverter=new Inverter();
        inverter.motor();

        Inverter inverter2=(Inverter) inverter;
        inverter2.backup();

        Machine machine = new Robot();
        machine.start();

        Robot robot = new Robot();
        robot.start();
        robot.scan();

        Robot robot2 = (Robot) machine;
        robot2.scan();

        Vehicle vehicle = new ElectricCar(); // Upcasting
        vehicle.startEngine();

        ElectricCar electric = new ElectricCar(); // Direct object
        electric.startEngine();

        ElectricCar electric2 = (ElectricCar) electric; // Downcasting
        electric2.chargeBattery();

        Hero hero = new SpiderMan(); // Upcasting
        hero.usePower();

        SpiderMan spidey = new SpiderMan(); // Normal object
        spidey.usePower();

        SpiderMan spidey2 = (SpiderMan) spidey; // Downcasting
        spidey2.climbWalls();

        Spacecraft spacecraft = new Rocket(); // Upcasting
        spacecraft.launch();

        Rocket rocket = new Rocket(); // Normal object
        rocket.launch();

        Rocket rocket2 = (Rocket) rocket; // Downcasting
        rocket2.deploySatellite();

        Creature creature = new Dragon(); // Upcasting
        creature.makeSound();

        Dragon dragon = new Dragon(); // Normal object
        dragon.makeSound();

        Dragon dragon2 = (Dragon) dragon; // Downcasting
        dragon2.breatheFire();

        Food food = new Pizza(); // Upcasting
        food.serve();

        Pizza pizza = new Pizza(); // Normal object
        pizza.serve();

        Pizza pizza2 = (Pizza) pizza; // Downcasting
        pizza2.addToppings();

        Instrument instrument = new Guitar(); // Upcasting
        instrument.play();

        Guitar guitar = new Guitar(); // Normal object
        guitar.play();

        Guitar guitar2 = (Guitar) guitar; // Downcasting
        guitar2.playSolo();

        Player player = new FootballPlayer(); // Upcasting
        player.play();

        FootballPlayer footballPlayer = new FootballPlayer(); // Normal object
        footballPlayer.play();

        FootballPlayer footballPlayer2 = (FootballPlayer) footballPlayer; // Downcasting
        footballPlayer2.scoreGoal();

        SeaCreature seaCreature = new Shark(); // Upcasting
        seaCreature.swim();

        Shark shark = new Shark(); // Normal object
        shark.swim();

        Shark shark2 = (Shark) shark; // Downcasting
        shark2.attack();

        Device device = new Smartphone(); // Upcasting
        device.turnOn();

        Smartphone smartphone = new Smartphone(); // Normal object
        smartphone.turnOn();

        Smartphone smartphone2 = (Smartphone) smartphone; // Downcasting
        smartphone2.useApp();

        Animal animal = new Dog(); // Upcasting
        animal.sound();

        Dog dog = new Dog(); // Normal object
        dog.sound();

        Dog dog2 = (Dog) dog; // Downcasting
        dog2.fetch();

        Weather weather = new Rain(); // Upcasting
        weather.forecast();

        Rain rain = new Rain(); // Normal object
        rain.forecast();

        Rain rain2 = (Rain) rain; // Downcasting
        rain2.bringUmbrella();

        Book book = new Novel(); // Upcasting
        book.read();

        Novel novel = new Novel(); // Normal object
        novel.read();

        Novel novel2 = (Novel) novel; // Downcasting
        novel2.recommend();

        Destination destination = new Beach(); // Upcasting
        destination.explore();

        Beach beach = new Beach(); // Normal object
        beach.explore();

        Beach beach2 = (Beach) beach; // Downcasting
        beach2.swim();

        Movie movie = new ActionMovie(); // Upcasting
        movie.play();

        ActionMovie actionMovie = new ActionMovie(); // Normal object
        actionMovie.play();

        ActionMovie actionMovie2 = (ActionMovie) actionMovie; // Downcasting
        actionMovie2.stunt();

        FarmMachine farmMachine = new Tractor(); // Upcasting
        farmMachine.operate();

        Tractor tractor = new Tractor(); // Normal object
        tractor.operate();

        Tractor tractor2 = (Tractor) tractor; // Downcasting
        tractor2.haul();

        sport sport = new Football(); // Upcasting
        sport.play();

        Football football = new Football(); // Normal object
        football.play();

        Football football2 = (Football) football; // Downcasting
        football2.scoreGoal();

        WeatherStation station = new RainGauge(); // Upcasting
        station.measure();

        RainGauge gauge = new RainGauge(); // Normal object
        gauge.measure();

        RainGauge gauge2 = (RainGauge) gauge; // Downcasting
        gauge2.report();

        SpaceMission mission = new MarsMission(); // Upcasting
        mission.launch();

        MarsMission mars = new MarsMission(); // Normal object
        mars.launch();

        MarsMission mars2 = (MarsMission) mars; // Downcasting
        mars2.collectSamples();

        Transport transport = new Train(); // Upcasting
        transport.move();

        Train train = new Train(); // Normal object
        train.move();

        Train train2 = (Train) train; // Downcasting
        train2.whistle();

        MedicalService service = new Surgery(); // Upcasting
        service.provideService();

        Surgery surgery = new Surgery(); // Normal object
        surgery.provideService();

        Surgery surgery2 = (Surgery) surgery; // Downcasting
        surgery2.sterilizeTools();

        Agriculture agri = new OrganicFarming(); // Upcasting
        agri.cultivate();

        OrganicFarming organic = new OrganicFarming(); // Normal object
        organic.cultivate();

        OrganicFarming organic2 = (OrganicFarming) organic; // Downcasting
        organic2.compost();

        Restaurant rest = new FineDining(); // Upcasting
        rest.serveFood();

        FineDining dining = new FineDining(); // Normal object
        dining.serveFood();

        FineDining dining2 = (FineDining) dining; // Downcasting
        dining2.pairWine();

        HomeDevice device1 = new SmartLight(); // Upcasting
        device1.turnOn();

        SmartLight light = new SmartLight(); // Normal object
        light.turnOn();

        SmartLight light2 = (SmartLight) light; // Downcasting
        light2.changeColor();

        Account account = new SavingsAccount(); // Upcasting
        account.deposit();

        SavingsAccount savings = new SavingsAccount(); // Normal object
        savings.deposit();

        SavingsAccount savings2 = (SavingsAccount) savings; // Downcasting
        savings2.calculateInterest();

        Library library = new DigitalLibrary(); // Upcasting
        library.issueBook();

        DigitalLibrary digitalLibrary = new DigitalLibrary(); // Normal object
        digitalLibrary.issueBook();

        DigitalLibrary digitalLibrary2 = (DigitalLibrary) digitalLibrary; // Downcasting
        digitalLibrary2.downloadBook();



    }
}
