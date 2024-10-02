package factory_method;

import factory_method.abstract_classes.Taxi;
import publicClasses.Passenger;

public class PremiumTaxi extends Taxi {
    public PremiumTaxi(String driverName, String license) {
        super(driverName, license);
    }

    @Override
    public void takePassenger(Passenger passenger) {
        System.out.println("Premium ride on RollsRoyce for passenger " + passenger);
    }
}
