package creational.abstract_factory.premium_implementation;

import creational.abstract_factory.abstract_classes.Driver;
import creational.abstract_factory.abstract_classes.Taxi;

public class PremiumTaxi extends Taxi {
    public PremiumTaxi(Driver driverName, String license) {
        super(driverName, license);
    }

    @Override
    public void takePassenger(String passenger) {
        System.out.println("Premium ride on RollsRoyce for passenger " + passenger);
    }
}
