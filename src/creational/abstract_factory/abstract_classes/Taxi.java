package creational.abstract_factory.abstract_classes;

public abstract class Taxi {
    private Driver driver;
    private String license;

    public Taxi(Driver driver, String license) {
        this.driver = driver;
        this.license = license;
    }

    public Driver getDriver() {
        return driver;
    }

    public String getLicense() {
        return license;
    }

    public abstract void takePassenger(String passenger);

}

