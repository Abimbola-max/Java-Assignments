import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyArrayListMethodsTest {

    private MyArrayListMethod arrayListMethod;

    @BeforeEach
    public void startWithThis() {
        arrayListMethod = new MyArrayListMethod();
    }

    @Test
    public void testThatArrayListIsEmpty() {
        assertEquals(arrayListMethod.listIsEmpty(), true);
    }

    @Test
    public void testThatArrayListIsNotEmpty_addAnElement() {
        assertEquals("76", arrayListMethod.addElement("76"));
        assertEquals("bibi", arrayListMethod.addElement("bibi"));
    }

    @Test
    public void testThatArrayListIsNotEmpty_removeAnElement() {
        assertEquals(0, arrayListMethod.getSizeOfArrayList());
        arrayListMethod.addElement("bibi");
        assertEquals(1, arrayListMethod.getSizeOfArrayList());
        arrayListMethod.isElementsRemoved("bibi");
        assertEquals(0, arrayListMethod.getSizeOfArrayList());
//        assertFalse(arrayListMethod.contains("bibi"));
    }

    @Test
    public void testToGetTheSize() {
        arrayListMethod.addElement("23");
        arrayListMethod.addElement("1");
        arrayListMethod.addElement("7");
        arrayListMethod.addElement("bibi");

        assertEquals(4, arrayListMethod.getSizeOfArrayList());
    }
}

