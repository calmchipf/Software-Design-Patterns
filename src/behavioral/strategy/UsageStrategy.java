package behavioral.strategy;

import behavioral.strategy.concrete_strategies.DistanceBasedStrategy;
import behavioral.strategy.concrete_strategies.FixedPriceStrategy;
import behavioral.strategy.concrete_strategies.TimeBasedStrategy;

public class UsageStrategy {
    public static void start() {
        TaxiService service = new TaxiService();
        TripDetails trip = new TripDetails(15, 30); // 15 km and 30 minutes

        // Set the pricing strategy to distance-based and calculate cost
        service.setPricingStrategy(new DistanceBasedStrategy(2.0)); // $2 per km
        System.out.println("Distance-based cost: $" + service.calculateTripCost(trip));

        // Set the pricing strategy to time-based and calculate cost
        service.setPricingStrategy(new TimeBasedStrategy(0.75)); // $0.75 per minute
        System.out.println("Time-based cost: $" + service.calculateTripCost(trip));

        // Set the pricing strategy to fixed price and calculate cost
        service.setPricingStrategy(new FixedPriceStrategy(20)); // fixed $20
        System.out.println("Fixed price cost: $" + service.calculateTripCost(trip));
    }
}
