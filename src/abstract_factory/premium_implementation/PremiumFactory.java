package abstract_factory.premium_implementation;

import abstract_factory.abstract_classes.Driver;
import abstract_factory.abstract_classes.Factory;
import abstract_factory.abstract_classes.Taxi;

public class PremiumFactory extends Factory {
    @Override
    public Driver createDriver(String driverName) {
        return new PremiumDriver(driverName);
    }

    @Override
    public Taxi createTaxi(String driverName, String license) {
        Driver driver = createDriver(driverName);
        return new PremiumTaxi(driver, license);
    }
}
