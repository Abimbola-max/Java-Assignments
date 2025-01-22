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
    public void testThatArrayListCanRemoveAnElement() {
        assertEquals(0, arrayListMethod.getSizeOfArrayList());
        arrayListMethod.addElement("bibi");
        assertEquals(1, arrayListMethod.getSizeOfArrayList());
        arrayListMethod.isElementsRemoved("bibi");
        assertEquals(0, arrayListMethod.getSizeOfArrayList());
    }

    @Test
    public void testToGetTheSize() {
        arrayListMethod.addElement("23");
        arrayListMethod.addElement("1");
        arrayListMethod.addElement("7");
        arrayListMethod.addElement("bibi");

        assertEquals(4, arrayListMethod.getSizeOfArrayList());
    }

    @Test
    public void testThatArrayListContainsAnElement() {
        arrayListMethod.addElement("60");
        arrayListMethod.addElement("2");
        arrayListMethod.addElement("50");

        assertEquals(true, arrayListMethod.isContains("60"));
        assertEquals(false, arrayListMethod.isContains("20"));
    }

    @Test
    public void testGetIndexOfAnElement() {
        arrayListMethod.addElement("78");
        arrayListMethod.addElement("56");
        arrayListMethod.addElement("80");

        assertEquals(1, arrayListMethod.getIndexOf("56"));
        assertEquals(0, arrayListMethod.getIndexOf("78"));
        assertEquals(2, arrayListMethod.getIndexOf("80"));
    }

    @Test
    public void getCapacity
}

