package behavioral.chain_of_responsibility.abstract_classes;

import behavioral.chain_of_responsibility.concrete_classes.Request;

public abstract class Handler {
    protected Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public abstract void handleRequest(Request request);
}

