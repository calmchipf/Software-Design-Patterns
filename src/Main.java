import behavioral.chain_of_responsibility.UsageCOR;
import behavioral.command.UsageCommand;
import behavioral.iterator.UsageIterator;
import behavioral.mediator.UsageMediator;
import behavioral.observer.UsageObserver;
import behavioral.state.UsageState;
import behavioral.strategy.UsageStrategy;
import behavioral.template_method.UsageTemplateMethod;
import creational.singleton.UsageSingleton;
import creational.prototype.UsagePrototype;
import creational.builder.UsageBuilder;
import creational.factory_method.UsageFactoryMethod;
import creational.abstract_factory.UsageAbstractFactory;
import structural.UsageAdapter;

public class Main {
    public static void main(String[] args) {
        // Creational Design Patterns:
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

        // Structural Design Patterns:
        System.out.println("Adapter Usage:");
        UsageAdapter.start();  // Oh, it has nothing to print.
        System.out.println();  // But I will keep these for consistency :D

        // Behavioral Design Patterns:
        System.out.println("Chain Of Responsibility Usage:");
        UsageCOR.start();
        System.out.println();

        System.out.println("Command Usage:");
        UsageCommand.start();
        System.out.println();

        System.out.println("Iterator Usage:");
        UsageIterator.start();
        System.out.println();

        System.out.println("Mediator Usage:");
        UsageMediator.start();
        System.out.println();

        System.out.println("Observer Usage:");
        UsageObserver.start();
        System.out.println();

        System.out.println("State Usage:");
        UsageState.start();
        System.out.println();

        System.out.println("Strategy Usage:");
        UsageStrategy.start();
        System.out.println();

        System.out.println("Template Method Usage:");
        UsageTemplateMethod.start();
        System.out.println();
    }
}
