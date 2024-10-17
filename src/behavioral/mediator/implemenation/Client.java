package behavioral.mediator.implemenation;

import behavioral.mediator.abstraction.Colleague;
import behavioral.mediator.abstraction.Mediator;

public class Client extends Colleague {
    public Client(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("Client received: " + message);
    }
}
