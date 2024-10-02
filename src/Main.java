import singleton.UsageSingleton;
import prototype.UsagePrototype;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Singleton Usage:");
        UsageSingleton.start();
        System.out.println();

        System.out.println("Prototype Usage:");
        UsagePrototype.start();
        System.out.println();
//        UsageBuilder.start();
//
//        UsageFactoryMethod.start();
//
//        UsageAbstractFactory.start();
    }
}
