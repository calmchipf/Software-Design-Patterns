package behavioral.chain_of_responsibility.concrete_classes;

import behavioral.chain_of_responsibility.abstract_classes.Handler;

public class LocationVerificationHandler extends Handler {
    public LocationVerificationHandler(Handler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if (request.isLocationServicable()) {
            System.out.println("Location is serviceable.");
            if (next != null) {
                next.handleRequest(request);
            }
        } else {
            System.out.println("Location cannot be serviced.");
        }
    }
}
