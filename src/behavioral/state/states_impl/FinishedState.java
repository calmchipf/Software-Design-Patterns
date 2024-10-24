package behavioral.state.states_impl;

import behavioral.state.OrderContext;
import behavioral.state.State;

public class FinishedState implements State {
    public void next(OrderContext context) {
        System.out.println("The order is already completed.");
    }

    public void previous(OrderContext context) {
        context.setState(new OnTheWayState());
    }

    public void printStatus() {
        System.out.println("Order completed.");
    }
}
