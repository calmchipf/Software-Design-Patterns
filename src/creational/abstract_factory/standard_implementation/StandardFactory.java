package creational.abstract_factory.standard_implementation;

import creational.abstract_factory.abstract_classes.Driver;
import creational.abstract_factory.abstract_classes.Factory;
import creational.abstract_factory.abstract_classes.Taxi;

public class StandardFactory extends Factory {
    @Override
    public Driver createDriver(String driverName) {
        return new StandardDriver(driverName);
    }

    @Override
    public Taxi createTaxi(String driverName, String license) {
        Driver driver = createDriver(driverName);
        return new StandardTaxi(driver, license);
    }
}
