package behavioral.observer;

public class Client implements Observer {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Client " + name + " notified: " + message);
    }
}
