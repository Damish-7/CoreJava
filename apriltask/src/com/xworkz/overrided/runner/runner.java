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

        Zoo zoo = new SafariZone(); // Upcasting
        zoo.feedAnimals();

        SafariZone safari = new SafariZone(); // Normal object
        safari.feedAnimals();

        SafariZone safari2 = (SafariZone) safari; // Downcasting
        safari2.startRide();

        Academy academy = new TennisAcademy(); // Upcasting
        academy.conductTraining();

        TennisAcademy tennis = new TennisAcademy(); // Normal object
        tennis.conductTraining();

        TennisAcademy tennis2 = (TennisAcademy) tennis; // Downcasting
        tennis2.organizeTournament();

        Attraction attraction = new RollerCoaster(); // Upcasting
        attraction.startRide();

        RollerCoaster coaster = new RollerCoaster(); // Normal object
        coaster.startRide();

        RollerCoaster coaster2 = (RollerCoaster) coaster; // Downcasting
        coaster2.performLoop();

        RoomService service1 = new LuxuryService(); // Upcasting
        service1.requestService();

        LuxuryService luxury = new LuxuryService(); // Normal object
        luxury.requestService();

        LuxuryService luxury2 = (LuxuryService) luxury; // Downcasting
        luxury2.serveChampagne();

        Tracker tracker = new AnimalTracker(); // Upcasting
        tracker.track();

        AnimalTracker animal2 = new AnimalTracker(); // Normal object
        animal2.track();

        AnimalTracker animal3 = (AnimalTracker) animal2; // Downcasting
        animal3.analyzeBehavior();

        Drone drone = new SurveillanceDrone(); // Upcasting
        drone.fly();

        SurveillanceDrone sd = new SurveillanceDrone(); // Normal object
        sd.fly();

        SurveillanceDrone sd2 = (SurveillanceDrone) sd; // Downcasting
        sd2.captureVideo();

        Factory factory = new AutomatedFactory(); // Upcasting
        factory.startProduction();

        AutomatedFactory automated = new AutomatedFactory(); // Normal object
        automated.startProduction();

        AutomatedFactory automated2 = (AutomatedFactory) automated; // Downcasting
        automated2.scheduleMaintenance();

        Patient patient = new Doctor(); // Upcasting
        patient.register();

        Doctor doctor = new Doctor(); // Normal object
        doctor.register();

        Doctor doctor2 = (Doctor) doctor; // Downcasting
        doctor2.prescribeMedication();

        Cart cart = new ShoppingCart(); // Upcasting
        cart.addItem();

        ShoppingCart shoppingCart = new ShoppingCart(); // Normal object
        shoppingCart.addItem();

        ShoppingCart shoppingCart2 = (ShoppingCart) shoppingCart; // Downcasting
        shoppingCart2.applyDiscount();

        ParkingSpot spot = new PremiumParkingSpot(); // Upcasting
        spot.parkCar();

        PremiumParkingSpot premiumSpot = new PremiumParkingSpot(); // Normal object
        premiumSpot.parkCar();

        PremiumParkingSpot premiumSpot2 = (PremiumParkingSpot) premiumSpot; // Downcasting
        premiumSpot2.addChargingStation();

        Room room = new ConferenceRoom(); // Upcasting
        room.bookRoom();

        ConferenceRoom conferenceRoom = new ConferenceRoom(); // Normal object
        conferenceRoom.bookRoom();

        ConferenceRoom conferenceRoom2 = (ConferenceRoom) conferenceRoom; // Downcasting
        conferenceRoom2.reserveEquipment();

        Voter voter = new OnlineVoter("Alice", "VoteOnline"); // Upcasting
        voter.vote();

        OnlineVoter onlineVoter = new OnlineVoter("Bob", "SecureVote"); // Normal object
        onlineVoter.vote();

        OnlineVoter onlineVoter2 = (OnlineVoter) onlineVoter; // Downcasting
        onlineVoter2.checkSecurity();

        Laptop laptop = new Keyboard();  // Upcasting
        laptop.coding();                // Calls overridden method in Keyboard
        laptop.working();               // Inherited method from Laptop

        Keyboard keyboard = new Keyboard();  // Direct object creation
        keyboard.coding();                  // Calls overridden method
        keyboard.working();                 // Inherited method from Laptop
        keyboard.conductwork();            // Method specific to Keyboard

        Keyboard keyboard2 = (Keyboard) laptop;  // Downcasting
        keyboard2.conductwork();

        Headset headset = new HeadPhone();  // Upcasting
        headset.EarOn();                   // Calls overridden method in HeadPhone
        headset.TalkOn();                  // Calls method from Headset

        HeadPhone headPhone = new HeadPhone();  // Direct object creation
        headPhone.EarOn();                      // Calls overridden method
        headPhone.TalkOn();                     // Inherited method
        headPhone.Gameon();                     // Unique method

        HeadPhone headPhone2 = (HeadPhone) headset;  // Downcasting
        headPhone2.Gameon();                         // Access HeadPhone-specific method

        Soap soap = new Pears();  // Upcasting
        soap.Bath();             // Calls overridden method in Pears
        soap.Clean();            // Inherited method from Soap

        Pears pears = new Pears();  // Direct object creation
        pears.Bath();               // Overridden method
        pears.Clean();              // Inherited method
        pears.Fresh();              // Unique method in Pears

        Pears pears2 = (Pears) soap;  // Downcasting
        pears2.Fresh();

        Shampoo shampoo = new HeadCare();  // Upcasting
        shampoo.HeadWash();               // Calls overridden method in HeadCare
        shampoo.BodyWash();               // Inherited method from Shampoo

        HeadCare headCare = new HeadCare();  // Direct object creation
        headCare.HeadWash();                // Overridden method
        headCare.BodyWash();                // Inherited method
        headCare.HeadClean();              // Unique method in HeadCare

        HeadCare headCare2 = (HeadCare) shampoo;  // Downcasting
        headCare2.HeadClean();

        PaperBox paperBox = new CardBoard();  // Upcasting
        paperBox.KeepOn();                   // Calls overridden method in CardBoard
        paperBox.ToStore();                  // Inherited method from PaperBox

        CardBoard cardBoard = new CardBoard();  // Direct object creation
        cardBoard.KeepOn();                     // Overridden method
        cardBoard.ToStore();                    // Inherited method
        cardBoard.PLaceIt();                    // Unique method in CardBoard

        CardBoard cardBoard2 = (CardBoard) paperBox;  // Downcasting
        cardBoard2.PLaceIt();

        AirPod airPod = new Wireless();  // Upcasting
        airPod.EarGood();               // Calls overridden method in Wireless
        airPod.GoodSound();             // Inherited method from AirPod

        Wireless wireless = new Wireless();  // Direct object creation
        wireless.EarGood();                  // Overridden method
        wireless.GoodSound();                // Inherited method
        wireless.Sounds();                   // Unique method in Wireless

        Wireless wireless2 = (Wireless) airPod;  // Downcasting
        wireless2.Sounds();
    }
}








