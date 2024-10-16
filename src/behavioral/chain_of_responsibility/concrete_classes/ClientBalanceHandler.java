package behavioral.chain_of_responsibility.concrete_classes;

import behavioral.chain_of_responsibility.abstract_classes.Handler;

public class ClientBalanceHandler extends Handler {
    public ClientBalanceHandler(Handler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if (request.isBalanceSufficient()) {
            System.out.println("Client balance is sufficient.");
            if (next != null) {
                next.handleRequest(request);
            }
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
