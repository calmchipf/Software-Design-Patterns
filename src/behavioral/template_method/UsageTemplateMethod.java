package behavioral.template_method;

import behavioral.template_method.abstract_classes.OrderProcess;
import behavioral.template_method.implementations.PremiumOrderProcess;
import behavioral.template_method.implementations.StandardOrderProcess;

public class UsageTemplateMethod {
    public static void start() {
        OrderProcess standardOrder = new StandardOrderProcess();
        standardOrder.processOrder();  // Process a standard order

        System.out.println();

        OrderProcess premiumOrder = new PremiumOrderProcess();
        premiumOrder.processOrder();  // Process a premium order
    }
}
