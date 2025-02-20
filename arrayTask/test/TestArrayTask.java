import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestArrayTask {

    @Test
    public void inputsOfCharXOrOWouldOutputOnesAndZerosTest() {
        ArrayTask arrayTask = new ArrayTask();
        char[][] characters = {
                                {'x', 'o', 'o'},
                                {'x', 'x', 'o'},
                                {'x', 'o', 'o'}
                            };
        int[][] expected = {
                                {1, 0, 0},
                                {1, 1, 0},
                                {1, 0, 0}
        };
        int[][] actual = arrayTask.replaceXwithOneThenOWithZero(characters);
        assertArrayEquals(expected, actual);
    }
}
