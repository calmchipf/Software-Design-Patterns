package behavioral.state.states_impl;

import behavioral.state.OrderContext;
import behavioral.state.State;

public class CreatedState implements State {
    public void next(OrderContext context) {
        context.setState(new ConfirmedState());
    }

    public void previous(OrderContext context) {
        System.out.println("The order is in the initial state.");
    }

    public void printStatus() {
        System.out.println("Order created.");
    }
}
