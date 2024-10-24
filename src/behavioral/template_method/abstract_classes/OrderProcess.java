package behavioral.template_method.abstract_classes;

public abstract class OrderProcess {
    // Template method
    public final void processOrder() {
        checkAvailability();
        calculateCost();
        confirmOrder();
    }

    protected void checkAvailability() {
        System.out.println("Checking availability of taxis...");
    }

    protected abstract void calculateCost();

    protected void confirmOrder() {
        System.out.println("Order confirmed.");
    }
}
