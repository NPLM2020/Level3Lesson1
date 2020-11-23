package boxes;

import fruits.Fruit;
import fruits.FruitManager;

import java.util.ArrayList;

// b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта,
// поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
public class Box<T extends Fruit> implements FruitManager<T> {

    //c. Для хранения фруктов внутри коробки можете использовать ArrayList
    private ArrayList<T> fruits;
    private float weight;

    public Box() {
        fruits = new ArrayList<>();
    }

    // d. Сделать метод getWeight() который высчитывает вес коробки,
    // зная количество фруктов и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
    public float getWeight() {
        float sum = 0;
        for (T fruit : fruits) {
            sum += fruit.getWeight();
        }
        return sum;
    }

    // g. Не забываем про метод добавления фрукта в коробку.
    @Override
    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    // e. Внутри класса коробка сделать метод compare,
    // который позволяет сравнить текущую коробку с той,
    // которую подадут в compare в качестве параметра, true - если их веса равны,
    // false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
    public boolean compare(Box anotherBox) {
        if (this.getWeight() == anotherBox.getWeight()) return true;
        return false;
    }

    //f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку
    // (помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами),
    // соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты,
    // которые были в этой коробке;
    public void moveAllFruits(Box<T> anotherBox) {
        for (T fruit : fruits) {
            anotherBox.addFruit(fruit);
        }
        fruits.clear();
    }

}
