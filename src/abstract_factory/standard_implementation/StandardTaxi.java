package abstract_factory.standard_implementation;

import abstract_factory.abstract_classes.Driver;
import abstract_factory.abstract_classes.Taxi;

public class StandardTaxi extends Taxi {
    public StandardTaxi(Driver driverName, String license) {
        super(driverName, license);
    }

    @Override
    public void takePassenger(String passenger) {
        System.out.println("Just a regular ride for passenger " + passenger);
    }
}
