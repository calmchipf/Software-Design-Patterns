package factory_method;

import factory_method.abstract_classes.Taxi;
import publicClasses.Passenger;

public class StandardTaxi extends Taxi {
    public StandardTaxi(String driverName, String license) {
        super(driverName, license);
    }

    @Override
    public void takePassenger(Passenger passenger) {
        System.out.println("Just a regular ride for passenger " + passenger);
    }
}
