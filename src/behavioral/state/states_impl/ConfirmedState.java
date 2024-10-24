package behavioral.state.states_impl;

import behavioral.state.OrderContext;
import behavioral.state.State;

public class ConfirmedState implements State {
    public void next(OrderContext context) {
        context.setState(new OnTheWayState());
    }

    public void previous(OrderContext context) {
        context.setState(new CreatedState());
    }

    public void printStatus() {
        System.out.println("Order confirmed.");
    }
}
