package behavioral.state;

import behavioral.state.states_impl.CreatedState;

public class OrderContext {
    private State currentState;

    public OrderContext() {
        currentState = new CreatedState(); // default state
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void next() {
        currentState.next(this);
    }

    public void previous() {
        currentState.previous(this);
    }

    public void printStatus() {
        currentState.printStatus();
    }
}
