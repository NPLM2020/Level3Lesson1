package fruits;

public interface FruitManager<T extends Fruit> {
    void addFruit(T fruit);
}
