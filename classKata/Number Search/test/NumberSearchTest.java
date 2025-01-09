import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberSearchTest {
    @Test
    public void testNumberSearch() {

        int[] number = {12, 17, 24, 32, 14};
        int search = 32;
        int actual = NumberSearch.numberSearch(number, search);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void numberSearchTest() {

        int[] numbers = {23, 67, 65, 9};
        int search = 60;
        assertThrows(IllegalArgumentException.class, () -> NumberSearch.numberSearch(numbers, search));
    }

}