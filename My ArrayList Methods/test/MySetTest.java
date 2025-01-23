import arraylist.MySet;
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
        mySet.addElement("bibi");
        assertEquals(0, mySet.getSizeOfSet("17"));
    }
}
