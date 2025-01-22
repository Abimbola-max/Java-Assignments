import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


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
    public void addElementToArrayList() {
        arrayListMethods.add("bibi");
    }


}
