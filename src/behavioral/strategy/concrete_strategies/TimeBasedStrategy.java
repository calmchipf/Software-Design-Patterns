package behavioral.strategy.concrete_strategies;

import behavioral.strategy.PricingStrategy;
import behavioral.strategy.TripDetails;

public class TimeBasedStrategy implements PricingStrategy {
    private double ratePerMinute;

    public TimeBasedStrategy(double ratePerMinute) {
        this.ratePerMinute = ratePerMinute;
    }

    @Override
    public double calculateCost(TripDetails details) {
        return details.getDuration() * ratePerMinute;
    }
}
