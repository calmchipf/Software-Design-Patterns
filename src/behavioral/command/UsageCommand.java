package behavioral.command;

import behavioral.command.implementations.CancelOrderCommand;
import behavioral.command.implementations.ChangeDestinationCommand;
import behavioral.command.implementations.CreateOrderCommand;
import behavioral.command.interfaces.Command;

public class UsageCommand {
    public static void start() {
        OrderReceiver receiver = new OrderReceiver();

        Command create = new CreateOrderCommand(receiver);
        Command cancel = new CancelOrderCommand(receiver);
        Command change = new ChangeDestinationCommand(receiver, "New York City");

        CommandInvoker invoker = new CommandInvoker();

        // Create an order
        invoker.setCommand(create);
        invoker.executeCommand();

        // Change the destination
        invoker.setCommand(change);
        invoker.executeCommand();

        // Cancel the order
        invoker.setCommand(cancel);
        invoker.executeCommand();
    }
}
