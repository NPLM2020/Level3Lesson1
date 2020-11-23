import boxes.Box;
import fruits.Apple;
import fruits.Orange;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Task 1 test
        String[] array = new String[] {
                "Good", "Bad", "Sad"
        };
        System.out.println("Task 1 before:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        swapArrayElements(array, 0, 1);

        System.out.println("Task 1 after:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // Task 2 test
        System.out.println();
        System.out.println(convertToArrayList(array));

        // Task 3 test
        System.out.println();
        Box<Orange> orangeBox1 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();
        Box<Apple> appleBox = new Box<>();

        orangeBox1.addFruit(new Orange());
        orangeBox1.addFruit(new Orange());
        orangeBox1.addFruit(new Orange());
        orangeBox1.addFruit(new Orange());

        orangeBox2.addFruit(new Orange());
        orangeBox2.addFruit(new Orange());

        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        System.out.println("orangeBox1 weight: " + orangeBox1.getWeight());
        System.out.println("orangeBox2 weight: " + orangeBox2.getWeight());
        System.out.println("appleBox weight: " + appleBox.getWeight());

        System.out.println(orangeBox2.compare(appleBox));

        orangeBox1.moveAllFruits(orangeBox2);
        System.out.println("orangeBox1 weight after moving: " + orangeBox1.getWeight());
        System.out.println("orangeBox2 weight after moving: " + orangeBox2.getWeight());

    }

    // 1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа)
    static <T> T[] swapArrayElements(T[] array, int indexFirst, int indexSecond) {
        T buffer;
        buffer = array[indexFirst];
        array[indexFirst] = array[indexSecond];
        array[indexSecond] = buffer;
        return array;
    }

    // 2. Написать метод, который преобразует массив в ArrayList
    static <T> ArrayList<T> convertToArrayList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

}
