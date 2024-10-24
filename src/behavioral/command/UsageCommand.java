package behavioral.command;

import behavioral.command.concrete_classes.CancelOrderCommand;
import behavioral.command.concrete_classes.ChangeDestinationCommand;
import behavioral.command.concrete_classes.CreateOrderCommand;
import behavioral.command.abstract_classes.Command;

public class UsageCommand {
    public static void start() {
        OrderReceiver receiver = new OrderReceiver();

        Command create = new CreateOrderCommand(receiver);
        Command cancel = new CancelOrderCommand(receiver);
        Command change = new ChangeDestinationCommand(receiver, "New York City");

        // Removed invoker but didn't fix
    }
}
