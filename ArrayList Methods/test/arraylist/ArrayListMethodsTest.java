package arraylist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ArrayListMethodsTest {
    ArrayListMethod arrayListMethods;

    @BeforeEach
    public void startWithThis() {
        arrayListMethods = new ArrayListMethod();
    }

    @Test
    public void testThatArrayListIsEmpty() {
        assertTrue(arrayListMethods.isEmptyTest());
    }


    @Test
    public void addElementToArrayListTest() {
         assertEquals("bibi", arrayListMethods.addElement("bibi"));
         assertEquals("aisha", arrayListMethods.addElement("aisha"));
    }

//    @Test
//    public void removeElementFromArrayListTest() {
//        assertEquals(0, arrayListMethods.removeElement("bibi"));
//
//    }
//
//    @Test
//    public void getIndexOfElementFromArrayListTest() {
//        arrayListMethods.addElement("bibi");
//        arrayListMethods.addElement("aisha");
//        arrayListMethods.addElement("bolaji");
//
//        assertEquals(1, arrayListMethods.getIndexOfElement("aisha"));
//        assertEquals(2, arrayListMethods.getIndexOfElement("bolaji"));
//        assertEquals(0, arrayListMethods.getIndexOfElement("bibi"));
//    }
//
//    @Test
//    public void checkThatArrayListContainsElementTest() {
//        arrayListMethods.addElement("2");
//        arrayListMethods.addElement("1");
//        arrayListMethods.addElement("7");
//        arrayListMethods.addElement("3");
//
//        assertEquals(true, arrayListMethods.isContained("2"));
//        assertEquals(false, arrayListMethods.isContained("56"));
//    }
//
//    @Test
//    public void checkThatArrayListAddsElementAndRemoveElementTest() {
//        arrayListMethods.addElement("bibi");
//        arrayListMethods.addElement("aisha");
//        arrayListMethods.addElement("bolaji");
//
//        arrayListMethods.removeElement("bibi");
//        assertEquals(false, arrayListMethods.isContained("bibi"));
//    }
//
//    @Test
//    public void getTheSizeOfArrayListTest() {
//        arrayListMethods.addElement("6");
//        arrayListMethods.addElement("9");
//        arrayListMethods.addElement("19");
//        arrayListMethods.addElement("21");
//
//        assertEquals(4, arrayListMethods.getArrayListSize());
//    }
//
//    @Test
//    public void appendElementToArrayListTest() {
//        arrayListMethods.addElement("1");
//        arrayListMethods.addElement("2");
//
//        assertEquals("1,2,3", arrayListMethods.appendToAnArrayList("3"));
//    }


}
