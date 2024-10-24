package behavioral.observer;

public class UsageObserver {
    public static void start() {
        Order order = new Order();
        Client client1 = new Client("Alice");
        Client client2 = new Client("Bob");

        // Clients subscribe to order updates
        order.attach(client1);
        order.attach(client2);

        // Changing the order status
        order.setStatus("Taxi is approaching");
        order.setStatus("Taxi has arrived");

        // Detach client1 and update status
        order.detach(client1);
        order.setStatus("Order completed");
    }
}
