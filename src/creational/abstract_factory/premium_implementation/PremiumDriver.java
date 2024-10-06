package creational.abstract_factory.premium_implementation;

import creational.abstract_factory.abstract_classes.Driver;

public class PremiumDriver extends Driver {
    public PremiumDriver(String driverName) {
        super(driverName);
    }

    @Override
    public void drive() {
        System.out.println("Driver with comfort");
    }
}