import arraylist.MySet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MySetTest {

    private MySet mySet;

    @BeforeEach
    public void startWithThis() {
        mySet  = new MySet();
    }

    @Test
    public void testThatSetIsEmpty() {
        assertTrue(mySet.isSetEmpty());
    }

    @Test
    public void testThatElementIsAdded() {
        assertEquals("bibi", mySet.addElement("bibi"));
        assertEquals("67", mySet.addElement("67"));
        assertEquals("88", mySet.addElement("88"));
    }

    @Test
    public void testThatElementIsRemoved_sizeIsGotten() {
        Assertions.assertEquals(0, mySet.getSizeOfArrayList());
        mySet.addElement("10");
        Assertions.assertEquals(1, mySet.getSizeOfArrayList());
        mySet.isElementsRemoved("10");
        Assertions.assertEquals(0, mySet.getSizeOfArrayList());
    }

    @Test
    public void testToGetSizeOfMySet() {
        mySet.addElement("100");
        mySet.addElement("67");
        mySet.addElement("88");
        mySet.addElement("1000");

        assertEquals(4, mySet.getSizeOfArrayList());
    }

    @Test
    public void testGetIndexOfAnElement() {
        mySet.addElement("78");
        mySet.addElement("56");
        mySet.addElement("80");

        Assertions.assertEquals(1, mySet.getIndexOf("56"));
        Assertions.assertEquals(0, mySet.getIndexOf("78"));
        Assertions.assertEquals(2, mySet.getIndexOf("80"));
    }
    
}
