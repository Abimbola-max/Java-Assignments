package arraylist;

import org.junit.jupiter.api.Assertions;
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
        Assertions.assertEquals(arrayListMethod.listIsEmpty(), true);
    }

    @Test
    public void testThatArrayListIsNotEmpty_addAnElement() {
        Assertions.assertEquals("76", arrayListMethod.addElement("76"));
        Assertions.assertEquals("bibi", arrayListMethod.addElement("bibi"));
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
    }

    @Test
    public void testThatArrayListContainsAnElement() {
        arrayListMethod.addElement("60");
        arrayListMethod.addElement("2");
        arrayListMethod.addElement("50");

        Assertions.assertEquals(true, arrayListMethod.isContains("60"));
        Assertions.assertEquals(false, arrayListMethod.isContains("20"));
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
}

