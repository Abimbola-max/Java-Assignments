package arraylist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMyQueueMethods {

    private MyQueueMethods queue;

    @BeforeEach
    public void startWithThis() {
        queue = new MyQueueMethods();
    }

    @Test
    public void testThatQueueIsEmpty() {
        assertTrue(queue.isEmpty());

    }
}
