import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ArrayListMethodsTest {
    ArrayListMethod arrayListMethods;

    @BeforeEach
    public void startWithThis() {
        arrayListMethods = new ArrayListMethod();
    }

    @Test
    public void testThatArrayListIsEmpty() {
        assertTrue(arrayListMethods.isEmpty());
    }

    @Test
    public void testThatArrayListIsNotEmpty() {
        assertFalse(arrayListMethods.isNotEmpty());
    }

    @Test
    public void addElementToArrayListTest() {
        assertEquals("bibi", arrayListMethods.addElement("bibi"));
        assertEquals("aisha", arrayListMethods.addElement("aisha"));
    }

    @Test
    public void removeElementFromArrayListTest() {
        assertEquals(0, arrayListMethods.removeElement("bibi"));

    }

    @Test
    public void getIndexOfElementFromArrayListTest() {
        arrayListMethods.addElement("bibi");
        arrayListMethods.addElement("aisha");
        arrayListMethods.addElement("bolaji");

        assertEquals(1, arrayListMethods.getIndexOfElement("aisha"));
        assertEquals(2, arrayListMethods.getIndexOfElement("bolaji"));
        assertEquals(0, arrayListMethods.getIndexOfElement("bibi"));
    }

    @Test
    public void checkThatArrayListContainsElementTest() {
        arrayListMethods.addElement("2");
        arrayListMethods.addElement("1");
        arrayListMethods.addElement("7");
        arrayListMethods.addElement("3");

        assertEquals(true, arrayListMethods.isContained("2"));
        assertEquals(false, arrayListMethods.isContained("56"));
    }

    @Test


}
