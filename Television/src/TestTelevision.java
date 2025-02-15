import org.junit.jupiter.api.Test;
import src.Television;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestTelevision {

    @Test
    public void tvIsOffByDefaultTest() {
        Television television = new Television();
        assertFalse(television.isOn());
    }

    @Test
    public void tvIsTurnedOnTest() {
        Television television = new Television();
        television.isOn();
        assertTrue(television.isTurnedOn());
    }

    @Test
    public void tvIsTurnedOffTest() {
        Television television = new Television();
        television.isOn();
    }
}
