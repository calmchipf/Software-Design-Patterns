package behavioral.iterator;

import java.util.List;

public class DriverIteratorImpl implements DriverIterator {
    private List<Driver> drivers;
    private int position;

    public DriverIteratorImpl(List<Driver> drivers) {
        this.drivers = drivers;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < drivers.size();
    }

    @Override
    public Driver next() {
        if (this.hasNext()) {
            return drivers.get(position++);
        }
        return null;
    }
}

