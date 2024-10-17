package behavioral.command.implementations;

import behavioral.command.OrderReceiver;
import behavioral.command.interfaces.Command;

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
