package behavioral.command.concrete_classes;

import behavioral.command.OrderReceiver;
import behavioral.command.abstract_classes.Command;

public class ChangeDestinationCommand implements Command {
    private OrderReceiver receiver;
    private String newDestination;

    public ChangeDestinationCommand(OrderReceiver receiver, String newDestination) {
        this.receiver = receiver;
        this.newDestination = newDestination;
    }

    @Override
    public void execute() {
        receiver.changeDestination(newDestination);
    }
}
