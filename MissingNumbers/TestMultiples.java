import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestMultiples {

    @Test
    public void testNumber() {
        int firstNumber = 1;
        int secondNumber = 10;
        int thirdNumber = 2;
        int[] expected = Multiples.getMultiples(firstNumber, secondNumber, thirdNumber);
        int[] actual = {2,4,6,8,10};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testMultiples() {
        int firstNumber = 2;
        int secondNumber = 15;
        int thirdNumber = 3;
        int[] expected = Multiples.getMultiples(firstNumber, secondNumber, thirdNumber);
        int[] actual = {3,6,9,12,15};
        assertArrayEquals(expected, actual);
    }
}
