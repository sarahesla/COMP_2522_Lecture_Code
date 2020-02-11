package week06.mockingRandomsExample;

import java.util.Random;

/**
 * Demonstrates a simple technique for mocking random numbers.
 *
 * @author BCIT
 * @version 2020
 */
public class MockingExample {

    /**
     * Rolls a die with the specified number of side the specified number of times.
     * @param random a Random object (this is called DEPENDENCY INJECTION because
     *               we are injecting the object this method depends on)
     * @param rolls an int
     * @param sides an int
     * @return sum the total of the dice roll(s)
     */
    public static int rollDie(Random random, int rolls, int sides) {
        int sum = 0;
        for (int i = 0; i < rolls; ++i) {
            sum += (1 + random.nextInt(sides));
        }
        return sum;
    }

    /**
     * Rolls a die with the specified number of side the specified number of times.
     * @param rolls an int
     * @param sides an int
     * @return sum the total of the dice roll(s)
     */
    public static int rollDie(int rolls, int sides) {
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < rolls; ++i) {
            sum += (1 + random.nextInt(sides));
        }
        return sum;
    }

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        final Random random = new Random();
        final int roll = rollDie(random, 3, 6);
        System.out.println(roll);
        final int anotherRoll = rollDie(3, 6);
        System.out.println(anotherRoll);
    }
}
