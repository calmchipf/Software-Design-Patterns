package creational.abstract_factory.standard_implementation;

import creational.abstract_factory.abstract_classes.Driver;

public class StandardDriver extends Driver {
    public StandardDriver(String driverName) {
        super(driverName);
    }

    @Override
    public void drive() {
        System.out.println("Driver regularly");
    }
}
