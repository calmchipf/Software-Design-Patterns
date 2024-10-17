package behavioral.command.implementations;

import behavioral.command.OrderReceiver;
import behavioral.command.interfaces.Command;

public class CreateOrderCommand implements Command {
    private OrderReceiver receiver;

    public CreateOrderCommand(OrderReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.createOrder();
    }
}
