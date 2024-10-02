import singleton.UsageSingleton;
import prototype.UsagePrototype;
import builder.UsageBuilder;

import java.util.Scanner;

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

//        UsageFactoryMethod.start();
//
//        UsageAbstractFactory.start();
    }
}
