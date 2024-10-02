package publicClasses;

public class Passenger {
    private String name;
    private String surname;
    private String driver;

    public Passenger(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void assignTaxi(String driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return name + ' ' + surname;
    }
}
