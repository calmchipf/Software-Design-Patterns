import singleton.UsageSingleton;
import prototype.UsagePrototype;
import builder.UsageBuilder;
import factory_method.UsageFactoryMethod;
import abstract_factory.UsageAbstractFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Singleton Usage:");
        UsageSingleton.start();
        System.out.println();

        System.out.println("Prototype Usage:");
        UsagePrototype.start();
        System.out.println();

        System.out.println("Builder Usage:");
        UsageBuilder.start();
        System.out.println();

        System.out.println("Factory Method Usage:");
        UsageFactoryMethod.start();
        System.out.println();

        System.out.println("Abstract Factory Usage:");
        UsageAbstractFactory.start();
        System.out.println();
    }
}
