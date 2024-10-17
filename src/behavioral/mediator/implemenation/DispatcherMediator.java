package behavioral.mediator.implemenation;

import behavioral.mediator.abstraction.Colleague;
import behavioral.mediator.abstraction.Mediator;

import java.util.ArrayList;
import java.util.List;

public class DispatcherMediator implements Mediator {
    private List<Colleague> colleagues;

    public DispatcherMediator() {
        colleagues = new ArrayList<>();
    }

    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void send(String message, Colleague originator) {
        for (Colleague colleague : colleagues) {
            // Do not send the message back to the originator
            if (colleague != originator) {
                colleague.receive(message);
            }
        }
    }
}

