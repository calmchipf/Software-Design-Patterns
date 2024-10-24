package behavioral.state;

public class UsageState {
    public static void start() {
        OrderContext order = new OrderContext();

        order.printStatus();

        order.next();
        order.printStatus();

        order.next();
        order.printStatus();

        order.next();
        order.printStatus();

        order.next(); // Attempt to go beyond the completed state

        order.previous(); // Go back to the previous state
        order.printStatus();
    }
}
