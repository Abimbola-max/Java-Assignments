import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
        arrayListMethod.addElement("76");
        assertEquals(arrayListMethod.listIsEmpty(), false);
        assertEquals(arrayListMethod.addElement("79"));
    }
}
