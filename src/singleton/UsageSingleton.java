package singleton;

import publicClasses.Passenger;

public class UsageSingleton {
    public static void start(){
        Passenger passenger = new Passenger("John", "Doe");

        DriverManager driverManager = DriverManager.getInstance();

        String driver = driverManager.findNearestDriver("Location A");

        passenger.assignTaxi(driver);
    }
}
