package behavioral.iterator;

public class Driver {
    private String name;
    private int location; // Simplified as an integer representing distance units from a central point

    public Driver(String name, int location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public int getLocation() {
        return location;
    }
}
