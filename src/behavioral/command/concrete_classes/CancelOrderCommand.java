package behavioral.command.concrete_classes;

import behavioral.command.OrderReceiver;
import behavioral.command.abstract_classes.Command;

public class CancelOrderCommand implements Command {
    private OrderReceiver receiver;

    public CancelOrderCommand(OrderReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.cancelOrder();
    }
}
