package creational.factoryMethod;

public class FactoryPatternEx {

    // GoF Definition: Define an interface for creating an object, but let subclasses decide which class to instantiate.
    // The factory method lets a class defer instantiation to subclasses.

    // Concept: The concept can be best described with the examples below.

    // Real-Life Example:
    // Suppose you have two different types of televisions—one with an LED screen and another with an LCD screen.
    // If any of these starts malfunctioning, you will call a TV repairman to request a visit to your residence.
    // The repairman must ask first what kind of TV is nonoperational.
    // As per your input, he’ll carry the required instruments with him.

    public static void main(String[] args) throws Exception {
        System.out.println("***Factory Pattern Demo***\n");
        IAnimalFactory animalFactory = new ConcreteFactory();

        IAnimal DuckType = animalFactory.getAnimalType("Duck");
        DuckType.speak();

        IAnimal TigerType = animalFactory.getAnimalType("Tiger");
        TigerType.speak();

        //There is no Lion type. So, an exception will be thrown
        IAnimal LionType = animalFactory.getAnimalType("Lion");
        LionType.speak();

    }

}
