package behavioral.strategy;

public class TaxiService {
    private PricingStrategy pricingStrategy;

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double calculateTripCost(TripDetails details) {
        return pricingStrategy.calculateCost(details);
    }
}
