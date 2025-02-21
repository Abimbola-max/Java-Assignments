import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SevenSegmentsTest {

    private SevenSegments sevenSegments;

    @Test
    public void allLightsAreOffByDefault() {
        sevenSegments = new SevenSegments("00000000");
        assertFalse(sevenSegments.isOff());
    }

    @Test
    public void allLightsAreTurnedOn() {
        sevenSegments = new SevenSegments("11111111");
        assertTrue(sevenSegments.isOn());
    }

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
        sevenSegments = new SevenSegments("10000001");
        String[][] getNumbers = sevenSegments.printHorizontalHash();
        String[][] expected = {{"#", "#", "#", "#"}};
        assertEquals(expected, getNumbers);
    }

}