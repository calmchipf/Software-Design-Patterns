package behavioral.strategy.concrete_strategies;

import behavioral.strategy.PricingStrategy;
import behavioral.strategy.TripDetails;

public class DistanceBasedStrategy implements PricingStrategy {
    private double ratePerKilometer;

    public DistanceBasedStrategy(double ratePerKilometer) {
        this.ratePerKilometer = ratePerKilometer;
    }

    @Override
    public double calculateCost(TripDetails details) {
        return details.getDistance() * ratePerKilometer;
    }
}
