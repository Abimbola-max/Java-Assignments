import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMyStack {

    private MyStack myStack;

    @BeforeEach
    public void startWithThis() {
        myStack = new MyStack();
    }

    @Test
    public void testMyStackIsEmpty() {
        assertTrue(myStack.isMyStackEmpty());
    }

    @Test
    public void testMyStackCanPush() {
        assertEquals("67", myStack.elementsAreAdded("67"));
        assertEquals("88", myStack.elementsAreAdded("88"));
        assertEquals("tayo", myStack.elementsAreAdded("tayo"));
    }

    @Test
    public void testThatMyStackRemovesAndReturnsSize() {
        myStack.elementsAreAdded("tayo");
        assertEquals(true, myStack.removeAndReturnsElement("tayo"));
        assertEquals(0, myStack.getSizeOfMyStack("tayo"));
    }

    @Test
    public void testThatMyStackReturnActualSize() {
        myStack.elementsAreAdded("23");
        myStack.elementsAreAdded("56");
        myStack.elementsAreAdded("78");

        assertEquals(3, myStack.getSizeOfMyStack("23"));
    }

    @Test



}
