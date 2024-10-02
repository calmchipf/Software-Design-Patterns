package abstract_factory;

import abstract_factory.abstract_classes.Factory;
import abstract_factory.abstract_classes.Taxi;
import abstract_factory.standard_implementation.StandardFactory;
import abstract_factory.premium_implementation.PremiumFactory;

public class UsageAbstractFactory {
    public static void start(){
        Factory factory = new StandardFactory();
        Taxi taxi = factory.createTaxi("Daniele", "XYZ12345");
        taxi.takePassenger("Rashad");
        // I got a bit confused thinking that Drivers were supposed to be created in usage
        // But passing the name and letting the factory handle the driver creation seems logical

        factory = new PremiumFactory();
        taxi = factory.createTaxi("Daniele", "XYZ12345");
        taxi.takePassenger("Samat");
    }
}
