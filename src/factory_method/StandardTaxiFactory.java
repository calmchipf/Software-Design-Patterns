package factory_method;

import factory_method.abstract_classes.Factory;
import factory_method.abstract_classes.Taxi;

public class StandardTaxiFactory extends Factory {
    @Override
    public Taxi createTaxi(String driverName, String license) {
        return new StandardTaxi(driverName, license);
    }
}
