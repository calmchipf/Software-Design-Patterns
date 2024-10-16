package behavioral.chain_of_responsibility;

import behavioral.chain_of_responsibility.concrete_classes.Request;
import behavioral.chain_of_responsibility.abstract_classes.Handler;
import behavioral.chain_of_responsibility.concrete_classes.CarAvailabilityHandler;
import behavioral.chain_of_responsibility.concrete_classes.ClientBalanceHandler;
import behavioral.chain_of_responsibility.concrete_classes.LocationVerificationHandler;

public class UsageCOR {
    public static void start() {
        Handler chain = new CarAvailabilityHandler(
                new ClientBalanceHandler(
                        new LocationVerificationHandler(null)
                )
        );

        Request request = new Request(true, true, false);
        chain.handleRequest(request);
    }
}
