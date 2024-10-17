package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class DriverCollection {
    private List<Driver> drivers;

    public DriverCollection() {
        this.drivers = new ArrayList<>();
    }

    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    public DriverIterator iterator() {
        return new DriverIteratorImpl(drivers);
    }
}

