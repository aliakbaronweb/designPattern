package creational.factoryMethod;

public abstract class IAnimalFactory {
    public abstract IAnimal getAnimalType(String type) throws Exception;

}
