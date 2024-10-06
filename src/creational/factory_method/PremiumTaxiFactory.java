package creational.factory_method;

import creational.factory_method.abstract_classes.Factory;
import creational.factory_method.abstract_classes.Taxi;

public class PremiumTaxiFactory extends Factory {
    @Override
    public Taxi createTaxi(String driverName, String license) {
        return new PremiumTaxi(driverName, license);
    }
}
