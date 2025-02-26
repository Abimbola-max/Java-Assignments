import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestMissingNumber {

    @Test
    public void checkMIssingNumberTaskTest {
        MissingNumbers number = new MissingNumbers();
        int[] numbers = {1,2,5};
        int[] expected = {3,4};
        int[] actual = getMissingNumbers(numbers);
        assertArrayEquals(expected, actual);
    }
}
