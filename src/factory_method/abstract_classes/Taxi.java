package factory_method.abstract_classes;

import publicClasses.Passenger;

public abstract class Taxi {
    private String driverName;
    private String license;

    public Taxi(String driverName, String license) {
        this.driverName = driverName;
        this.license = license;
    }

    public abstract void takePassenger(Passenger passenger);
}