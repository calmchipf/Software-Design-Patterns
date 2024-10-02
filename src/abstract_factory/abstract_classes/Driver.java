package abstract_factory.abstract_classes;

public abstract class Driver {
    private String name;

    public Driver(String name) {
        this.name = name;
    }

    public abstract void drive();

}
