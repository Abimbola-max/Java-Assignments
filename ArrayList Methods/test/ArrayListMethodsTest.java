import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ArrayListMethodsTest {
    ArrayListMethod arrayListMethod;

    @BeforeEach
    public void startWithThis() {
        arrayListMethod = new ArrayListMethod();
    }

    @Test
    public void testThatArrayListIsEmpty() {
        ArrayListMethod arrayListMethods = new ArrayListMethod();
        assertTrue(arrayListMethods.isEmpty());
    }

    @Test
    public void testThatArrayListIsNotEmpty() {
        ArrayListMethod arrayListMethods = new ArrayListMethod();
        assertFalse(arrayListMethods.isNotEmpty());
    }

    @Test
    public void addElementToArrayList() {
        ArrayListMethod arrayListMethods = new ArrayListMethod();
        arrayListMethods.add("bibi");
    }


}
