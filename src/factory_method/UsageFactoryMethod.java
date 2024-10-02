package factory_method;

import factory_method.abstract_classes.Factory;
import factory_method.abstract_classes.Taxi;
import publicClasses.Passenger;

public class UsageFactoryMethod {
    public static void start(){
        Passenger passenger1 = new Passenger("John", "Doe");
        Factory factory = new StandardTaxiFactory();
        Taxi taxi = factory.createTaxi("Daniele", "XYZ12345");
        taxi.takePassenger(passenger1);

        Passenger passenger2 = new Passenger("Marie", "Moreau");
        factory = new PremiumTaxiFactory();
        taxi = factory.createTaxi("Daniele", "XYZ12345");
        taxi.takePassenger(passenger2);
    }
}
