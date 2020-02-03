package week04.arraylist;

import java.util.ArrayList;
import java.util.Random;

public class ConcurrentModsAreBad {

    public static void main(String[] args) {
        final ArrayList<Integer> numbers = new ArrayList<>();
        final Random seeder = new Random();
        final int size = 100;
        for (int i = 0; i < size; ++i) {
            numbers.add(seeder.nextInt(size));
        }

        for (int i = 0; i < size; ++i) {
            if (numbers.get(i) < 90) {
                numbers.remove(i);
            }
        }

    }
}
