package behavioral.strategy;

public class TripDetails {
    private double distance; // in kilometers
    private double duration; // in minutes

    public TripDetails(double distance, double duration) {
        this.distance = distance;
        this.duration = duration;
    }

    public double getDistance() {
        return distance;
    }

    public double getDuration() {
        return duration;
    }
}
