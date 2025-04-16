package com.xworkz.overrided.external;

import com.xworkz.overrided.internal.*;

public class TypeCasting {

        public TypeCasting() {
            System.out.println("no-arg constructor for TypeCasting");
        }

        // 1. Movie example
        public void processMovie(Movie movie) {
            if (movie != null) {
                movie.play();
                if (movie instanceof ActionMovie) {
                    ActionMovie pm = (ActionMovie) movie;
                    pm.play();
                }
            }
        }

        // 2. Smart home example
        public void controlDevice(HomeDevice device) {
            if (device != null) {
                device.turnOn();
                if (device instanceof SmartLight) {
                    SmartLight light = (SmartLight) device;
                    light.turnOn();
                }
            }
        }

        // 3. Library management example
        public void manageBook(Book book) {
            if (book != null) {
                book.read();
                if (book instanceof Novel) {
                    Novel novel = (Novel) book;
                    novel.read();
                }
            }
        }

        // 4. Shopping cart example
        public void Cart(Cart cart) {
            if (cart != null) {
                cart.addItem();
                if (cart instanceof ShoppingCart) {
                    ShoppingCart shop = (ShoppingCart) cart;
                    shop.addItem();
                }
            }
        }

    public void Vehicle(Vehicle vehicle) {
        if (vehicle != null) {
            vehicle.startEngine();
            if (vehicle instanceof ElectricCar) {
                ElectricCar electricCar = (ElectricCar) vehicle;
                electricCar.chargeBattery();
            }
        }
    }
    public void Animal(Animal animal) {
        if (animal != null) {
            animal.sound();
            if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                dog.sound();
            }
        }
    }
    public void Account(Account account) {
        if (account != null) {
            account.deposit();
            if (account instanceof SavingsAccount) {
                SavingsAccount sa = (SavingsAccount) account;
                sa.deposit();
            }
        }
    }
    public void Instrument(Instrument instrument) {
        if (instrument != null) {
            instrument.play();
            if (instrument instanceof Guitar) {
                Guitar guitar = (Guitar) instrument;
                guitar.play();
            }
        }
    }
    public void Generator(Generator generator) {
        if (generator != null) {
            generator.motor();
            if (generator instanceof Inverter) {
                Inverter inverter = (Inverter) generator;
                inverter.backup();
            }
        }
    }
    public void Academy(Academy academy) {
        if (academy != null) {
            academy.conductTraining();
            if (academy instanceof TennisAcademy) {
                TennisAcademy tennisAcademy = (TennisAcademy) academy;
                tennisAcademy.conductTraining();
            }
        }
    }
    public void Agriculture(Agriculture agriculture) {
        if (agriculture != null) {
            agriculture.cultivate();
            if (agriculture instanceof OrganicFarming) {
                OrganicFarming organicFarming= (OrganicFarming) agriculture;
                organicFarming.cultivate();
            }
        }
    }
    public void Tracker(Tracker tracker) {
        if (tracker != null) {
            tracker.track();
            if (tracker instanceof AnimalTracker) {
                AnimalTracker animalTracker= (AnimalTracker) tracker;
                animalTracker.track();
            }
        }
    }
    public void RoomService(RoomService roomService) {
        if (roomService != null) {
            roomService.requestService();
            if (roomService instanceof LuxuryService) {
                LuxuryService luxuryService= (LuxuryService) roomService;
                luxuryService.requestService();
            }
        }
    }
    public void Factory(Factory factory) {
        if (factory != null) {
            factory.startProduction();
            if (factory instanceof AutomatedFactory) {
                AutomatedFactory automatedFactory= (AutomatedFactory) factory;
                automatedFactory.startProduction();
            }
        }
    }
    public void Transport(Transport transport) {
        if (transport != null) {
            transport.move();
            if (transport instanceof Train) {
                Train train= (Train) transport;
                train.move();
            }
        }
    }
    public void Attraction(Attraction attraction) {
        if (attraction != null) {
            attraction.startRide();
            if (attraction instanceof RollerCoaster) {
                RollerCoaster rollerCoaster= (RollerCoaster) attraction;
                rollerCoaster.startRide();
            }
        }
    }
    public void Creature(Creature creature) {
        if (creature != null) {
            creature.makeSound();
            if (creature instanceof Dragon) {
                Dragon dragon= (Dragon) creature;
                dragon.makeSound();
            }
        }
    }
    public void Restaurant(Restaurant restaurant) {
        if (restaurant != null) {
            restaurant.serveFood();
            if (restaurant instanceof FineDining) {
                FineDining fineDining= (FineDining) restaurant;
                fineDining.serveFood();
            }
        }
    }
    public void Player(Player player) {
        if (player != null) {
            player.play();
            if (player instanceof FootballPlayer) {
                FootballPlayer footballPlayer= (FootballPlayer) player;
                footballPlayer.play();
            }
        }
    }
    public void HomeDevice(HomeDevice homeDevice) {
        if (homeDevice != null) {
            homeDevice.turnOff();
            if (homeDevice instanceof SmartLight) {
                SmartLight smartLight= (SmartLight) homeDevice;
                smartLight.turnOff();
            }
        }
    }
    public void Zoo(Zoo zoo) {
        if (zoo != null) {
            zoo.feedAnimals();
            if (zoo instanceof SafariZone) {
                SafariZone safariZone= (SafariZone) zoo;
                safariZone.feedAnimals();
            }
        }
    }
    public void Room(Room room) {
        if (room != null) {
            room.bookRoom();
            if (room instanceof ConferenceRoom) {
                ConferenceRoom conferenceRoom= (ConferenceRoom) room;
                room.bookRoom();
            }
        }
    }
    public void Destination(Destination destination) {
        if (destination != null) {
            destination.explore();
            if (destination instanceof Beach) {
                Beach beach= (Beach) destination;
                beach.explore();
            }
        }
    }
    public void Hero(Hero hero) {
        if (hero != null) {
            hero.usePower();
            if (hero instanceof SpiderMan) {
                SpiderMan spiderMan= (SpiderMan) hero;
                hero.usePower();
            }
        }
    }
    public void MedicalService(MedicalService medicalService) {
        if (medicalService != null) {
            medicalService.provideService();
            if (medicalService instanceof Surgery) {
                Surgery surgery= (Surgery) medicalService;
                surgery.provideService();
            }
        }
    }















}


