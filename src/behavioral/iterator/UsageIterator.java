package behavioral.iterator;

public class UsageIterator {
    public static void start(){
        DriverCollection collection = new DriverCollection();
        collection.addDriver(new Driver("Alice", 10));
        collection.addDriver(new Driver("Bob", 5));
        collection.addDriver(new Driver("Charlie", 20));

        int clientLocation = 7; // The client's location
        Driver closestDriver = findClosestDriver(collection, clientLocation);
        if (closestDriver != null) {
            System.out.println("The closest driver is: " + closestDriver.getName() + " at location " + closestDriver.getLocation());
        } else {
            System.out.println("No drivers available.");
        }
    }

    public static Driver findClosestDriver(DriverCollection collection, int clientLocation) {
        DriverIterator iterator = collection.iterator();
        Driver closestDriver = null;
        int minDistance = Integer.MAX_VALUE;

        while (iterator.hasNext()) {
            Driver currentDriver = iterator.next();
            int distance = Math.abs(currentDriver.getLocation() - clientLocation);
            if (distance < minDistance) {
                minDistance = distance;
                closestDriver = currentDriver;
            }
        }

        return closestDriver;
    }
}
