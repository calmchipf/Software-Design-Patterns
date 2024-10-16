package behavioral.chain_of_responsibility.concrete_classes;

import behavioral.chain_of_responsibility.abstract_classes.Handler;

public class CarAvailabilityHandler extends Handler {
    public CarAvailabilityHandler(Handler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if (request.hasAvailableCars()) {
            System.out.println("Car is available.");
            if (next != null) {
                next.handleRequest(request);
            }
        } else {
            System.out.println("No cars available.");
        }
    }
}
