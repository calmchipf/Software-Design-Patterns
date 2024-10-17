package behavioral.mediator.implemenation;

import behavioral.mediator.abstraction.Colleague;
import behavioral.mediator.abstraction.Mediator;

public class Dispatcher extends Colleague {
    public Dispatcher(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("Dispatcher received: " + message);
    }
}
