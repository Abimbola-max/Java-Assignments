package arraylist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class MyArrayListMethodsTest {

    private MyArrayListMethods arrayListMethod;

    @BeforeEach
    public void startWithThis() {
        arrayListMethod = new MyArrayListMethods();
    }

    @Test
    public void testThatArrayListIsEmpty() {
        Assertions.assertEquals(arrayListMethod.listIsEmpty(), true);
    }

    @Test
    public void testThatArrayListIsNotEmpty_addAnElement() {
        Assertions.assertEquals("76", arrayListMethod.addElement("76"));
        Assertions.assertEquals("bibi", arrayListMethod.addElement("bibi"));
        assertFalse(arrayListMethod.listIsEmpty());
    }

    @Test
    public void testThatArrayListCanRemoveAnElement() {
        Assertions.assertEquals(0, arrayListMethod.getSizeOfArrayList());
        arrayListMethod.addElement("bibi");
        Assertions.assertEquals(1, arrayListMethod.getSizeOfArrayList());
        arrayListMethod.isElementsRemoved("bibi");
        Assertions.assertEquals(0, arrayListMethod.getSizeOfArrayList());
    }

    @Test
    public void testToGetTheSize() {
        arrayListMethod.addElement("23");
        arrayListMethod.addElement("1");
        arrayListMethod.addElement("7");
        arrayListMethod.addElement("bibi");

        Assertions.assertEquals(4, arrayListMethod.getSizeOfArrayList());
        assertFalse(arrayListMethod.listIsEmpty());
    }

    @Test
    public void testThatArrayListContainsAnElement() {
        arrayListMethod.addElement("60");
        arrayListMethod.addElement("2");
        arrayListMethod.addElement("50");

        Assertions.assertEquals(true, arrayListMethod.isContains("60"));
        Assertions.assertEquals(false, arrayListMethod.isContains("20"));
        assertFalse(
                arrayListMethod.isContains("77"));
    }

    @Test
    public void testGetIndexOfAnElement() {
        arrayListMethod.addElement("78");
        arrayListMethod.addElement("56");
        arrayListMethod.addElement("80");

        Assertions.assertEquals(1, arrayListMethod.getIndexOf("56"));
        Assertions.assertEquals(0, arrayListMethod.getIndexOf("78"));
        Assertions.assertEquals(2, arrayListMethod.getIndexOf("80"));
    }
    @Test
    public void testThatArrayListCanAddBeyondTheSize() {
        arrayListMethod.addElement("1");
        arrayListMethod.addElement("2");
        arrayListMethod.addElement("3");
        arrayListMethod.addElement("4");
        arrayListMethod.addElement("5");
        arrayListMethod.addElement("6");
        arrayListMethod.addElement("18");

        Assertions.assertEquals(7, arrayListMethod.getSizeOfArrayList());
    }

    @Test
    public void testThatArrayListCanInsertAtAnIndex() {
        arrayListMethod.addElement("1");
        arrayListMethod.addElement("2");
        arrayListMethod.insertAtAnIndex("4", 1);

        Assertions.assertEquals(3, arrayListMethod.getSizeOfArrayList());
    }
}

