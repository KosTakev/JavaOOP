import HierarchicalInheritance.Cat;
import MultipleInheritance.Puppy;
import RandomArrayList.RandomArrayList;
import SingleInheritance.Dog;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

//        Dog dog = new Dog();
//
//        dog.eat();
//        dog.bark();
//
//        Cat cat = new Cat();
//
//        cat.eat();
//        cat.meow();

        RandomArrayList<Integer> randomArrayList = new RandomArrayList<Integer>();

        for (int i = 1; i <= 13; i++) {

            randomArrayList.add(i);
        }

        System.out.println(randomArrayList.getRandomElement());
    }
}
