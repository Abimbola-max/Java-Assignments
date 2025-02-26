import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestMissingNumber {

    @Test
    public void checkMissingNumberTest() {
        MissingNumber number = new MissingNumber();
        int[] numbers = {1,2,5};
        int[] expectedNumbers = {3,4};
        int[] actual = number.getMissingNumber(numbers);
        assertArrayEquals(expectedNumbers, actual);
    }
}
