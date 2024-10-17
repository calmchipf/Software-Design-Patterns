package behavioral.mediator.implemenation;

import behavioral.mediator.abstraction.Colleague;
import behavioral.mediator.abstraction.Mediator;

public class Driver extends Colleague {
    public Driver(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("Driver received: " + message);

    }
}