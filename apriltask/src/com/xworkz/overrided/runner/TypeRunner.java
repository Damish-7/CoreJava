package com.xworkz.overrided.runner;

import com.xworkz.overrided.external.*;
import com.xworkz.overrided.internal.*;

public class TypeRunner {
    public static void main(String[] args) {
    TypeCasting typeCasting = new TypeCasting();

    // 1. Movie
    Movie movie = new ActionMovie();
        typeCasting.processMovie(movie);

    // 2. Smart home
    HomeDevice device = new SmartLight();
        typeCasting.controlDevice(device);

    // 3. Library management
    Book book = new Novel();
        typeCasting.manageBook(book);

    // 4. Shopping cart
    Cart cart = new ShoppingCart();
        typeCasting.Cart(cart);

    // 5. Vehicle
    Vehicle vehicle = new ElectricCar();
        typeCasting.Vehicle(vehicle);

    // 6. Animal
    Animal animal = new Dog();
        typeCasting.Animal(animal);

    // 7. Account
    Account account = new SavingsAccount();
        typeCasting.Account(account);

    // 8. Instrument
    Instrument instrument = new Guitar();
        typeCasting.Instrument(instrument);

    // 9. Generator
    Generator generator = new Inverter();
        typeCasting.Generator(generator);

    // 10. Academy
    Academy academy = new TennisAcademy();
        typeCasting.Academy(academy);

    // 11. Agriculture
    Agriculture agriculture = new OrganicFarming();
        typeCasting.Agriculture(agriculture);

    // 12. Tracker
    Tracker tracker = new AnimalTracker();
        typeCasting.Tracker(tracker);

    // 13. RoomService
    RoomService roomService = new LuxuryService();
        typeCasting.RoomService(roomService);

    // 14. Factory
    Factory factory = new AutomatedFactory();
        typeCasting.Factory(factory);
}
}

