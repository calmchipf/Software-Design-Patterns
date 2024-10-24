package behavioral.strategy.concrete_strategies;

import behavioral.strategy.PricingStrategy;
import behavioral.strategy.TripDetails;

public class FixedPriceStrategy implements PricingStrategy {
    private double fixedRate;

    public FixedPriceStrategy(double fixedRate) {
        this.fixedRate = fixedRate;
    }

    @Override
    public double calculateCost(TripDetails details) {
        return fixedRate;
    }
}
