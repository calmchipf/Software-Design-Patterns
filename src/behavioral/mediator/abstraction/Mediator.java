package behavioral.mediator.abstraction;

public interface Mediator {
    void send(String message, Colleague colleague);
}
