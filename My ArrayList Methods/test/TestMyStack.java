import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        assertEquals("67", myStack.elementsAreAdded_pushMethod("67"));
        assertEquals("88", myStack.elementsAreAdded_pushMethod("88"));
        assertEquals("tayo", myStack.elementsAreAdded_pushMethod("tayo"));
        assertFalse(myStack.isMyStackEmpty());
    }

    @Test
    public void testThatMyStackRemovesAndReturnsSize() {
        myStack.elementsAreAdded_pushMethod("tayo");
        assertEquals(true, myStack.removeTheElement_popMethod("tayo"));
        assertEquals(0, myStack.getSizeOfMyStack());
        assertTrue(myStack.isMyStackEmpty());
    }

    @Test
    public void testThatMyStackReturnActualSize() {
        myStack.elementsAreAdded_pushMethod("23");
        myStack.elementsAreAdded_pushMethod("56");
        myStack.elementsAreAdded_pushMethod("78");

        assertEquals(3, myStack.getSizeOfMyStack());
        assertFalse(myStack.isMyStackEmpty());
    }

    @Test
    public void testPop_returnsTopOfStackAndRemoves() {
        myStack.elementsAreAdded_pushMethod("45");
        myStack.elementsAreAdded_pushMethod("56");

        assertEquals(true, myStack.removeTheElement_popMethod("45"));
        assertEquals(1, myStack.getSizeOfMyStack());
    }

}
