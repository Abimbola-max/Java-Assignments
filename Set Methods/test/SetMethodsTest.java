import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class SetMethodsTest {

    private SetMethods setMethods;

    @BeforeEach
    public void startsWithThis() {
        setMethods = new SetMethods();
    }

    @Test
    public void test_ThatSetsIsEmpty() {
        assertTrue(setMethods.isEmpty());

    }

    @Test
    public void test_ThatSetsIsNotEmpty() {
        setMethods.addElementsToSet(56);
        assertEquals( 56, setMethods.addElementsToSet(56));
    }

    @Test
    public void test_ThatAllElementsAreAddedToSet() {
        setMethods.addElementsToSet(56);
        setMethods.addElementsToSet(13);
        setMethods.addElementsToSet(2);

        assertEquals( [56,13,2], setMethods.addAllElementsToSet(56,13,3));
    }
}
