import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
        setMethods.add(56);
        setMethods.add(13);

        assertFalse([56, 13], setMethods.addElementsToSet());
    }
}
