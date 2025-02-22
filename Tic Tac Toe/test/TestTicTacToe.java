import Exceptions.InvalidCharacterException;
import Exceptions.InvalidUserIdException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestTicTacToe {

    @Test
    void testCreatePlayerValid() {
        Player player = new Player(1, Value.X);
        assertEquals(1, player.getId());
        assertEquals(Value.X, player.getValue());
    }

    @Test
    void testCreatePlayerInvalidId() {
        assertThrows(InvalidUserIdException.class, () -> new Player(3, Value.X));
    }

}
