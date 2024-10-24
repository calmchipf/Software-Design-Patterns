package behavioral.template_method.implementations;

import behavioral.template_method.abstract_classes.OrderProcess;

public class StandardOrderProcess extends OrderProcess {
    @Override
    protected void calculateCost() {
        System.out.println("Calculating cost based on standard rates...");
    }
}
