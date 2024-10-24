package behavioral.state;

public interface State {
    void next(OrderContext context);
    void previous(OrderContext context);
    void printStatus();
}
