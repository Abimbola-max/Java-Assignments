import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SevenSegmentsTest {

    private SevenSegments sevenSegments;

    @Test
    public void testThatIncorrectInputLengthThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new SevenSegments("100111"));
    }

    @Test
    public void inputsThatIsNotZerosAndOnesThrowsIllegalArgumentExceptionTest() {
        assertThrows(IllegalArgumentException.class, () -> new SevenSegments("23100011"));
    }

    @Test
    public void inputThatInputsWithZerosAndOnesPrintActualHarshTest() {
        sevenSegments = new SevenSegments("11100011");
        int getNumbers = sevenSegments.getNumbers()
    }

}