package RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<E> extends ArrayList {

    public E getRandomElement() {

        // get the size of the ArrayList:
        int end = super.size();
        Random rand = new Random();
        int randIndex = rand.nextInt(end);
        return (E) remove(randIndex);
    }
}
