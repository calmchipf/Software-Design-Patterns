package creational.factory_method.abstract_classes;

public abstract class Factory {
    public abstract Taxi createTaxi(String driverName, String license);
}