import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestMissingArrayNumbers {

    @Test
    public void testMissingArrayNumbers() {
        int[] numbers = {1,2,5};
        int[] expected = {3,4};
        int[] actual = MissingArrayNumbers.getMissingNumbers(numbers);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testMissingArrayNumbers2() {
        int[] numbers = {77,78,80};
        int[] expected = {79};
        int[] actual = MissingArrayNumbers.getMissingNumbers(numbers);
        assertArrayEquals(expected, actual);
    }
}
