package behavioral.chain_of_responsibility.concrete_classes;

public class Request {
    private boolean availableCars;
    private boolean sufficientBalance;
    private boolean serviceableLocation;

    public Request(boolean availableCars, boolean sufficientBalance, boolean serviceableLocation) {
        this.availableCars = availableCars;
        this.sufficientBalance = sufficientBalance;
        this.serviceableLocation = serviceableLocation;
    }

    public boolean hasAvailableCars() {
        return availableCars;
    }

    public boolean isBalanceSufficient() {
        return sufficientBalance;
    }

    public boolean isLocationServicable() {
        return serviceableLocation;
    }
}

