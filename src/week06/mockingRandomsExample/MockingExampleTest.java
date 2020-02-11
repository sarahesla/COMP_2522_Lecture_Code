package week06.mockingRandomsExample;

import org.junit.Test;
import org.mockito.Mock;

import java.util.Random;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Demonstrates two simple techniques for mocking random numbers.
 *
 * @author BCIT
 * @version 2020
 */
public class MockingExampleTest {

    @Mock
    private Random fakeRandom = mock(Random.class);

    /**
     * Tests the version of rollDie that uses dependency injection.
     */
    @Test
    public void rollDieWithRandomReturnsCorrectSum() {
        //when(fakeRandom.nextInt()).thenReturn(1).thenReturn(1).thenReturn(1);
        doReturn(1).when(fakeRandom).nextInt();

        assertEquals(3, MockingExample.rollDie(fakeRandom, 3, 6));
    }

    /**
     * Tests the version of rollDie that does not use dependency injection.
     */
    @Test
    public void rollDieReturnsCorrectSum() {
        when(fakeRandom.nextInt()).thenReturn(1).thenReturn(1).thenReturn(1);
        //doReturn(1).when(fakeRandom).nextInt();
        assertEquals(3, MockingExample.rollDie(fakeRandom, 3, 6));
    }
}