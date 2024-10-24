package behavioral.state.states_impl;

import behavioral.state.OrderContext;
import behavioral.state.State;

public class OnTheWayState implements State {
    public void next(OrderContext context) {
        context.setState(new FinishedState());
    }

    public void previous(OrderContext context) {
        context.setState(new ConfirmedState());
    }

    public void printStatus() {
        System.out.println("Taxi is on the way.");
    }
}