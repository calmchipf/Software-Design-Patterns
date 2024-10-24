package behavioral.template_method.implementations;

import behavioral.template_method.abstract_classes.OrderProcess;

public class PremiumOrderProcess extends OrderProcess {
    @Override
    protected void calculateCost() {
        System.out.println("Calculating cost using premium rates...");
    }
}
