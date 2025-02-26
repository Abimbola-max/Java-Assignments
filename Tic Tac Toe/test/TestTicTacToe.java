import Exceptions.InvalidUserIdException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestTicTacToe {

    @Test
    public void firstPlayerIsPlayerOneAndPlayCharXTest() {
        Player player = new Player(1, Value.X);
        assertEquals(1, player.getId());
        assertEquals(Value.X, player.getValue());
    }

    @Test
    public void ticTacToeGameCreationAndNumberOfPlayerCheckTest() {
        Player player1 = new Player(1, Value.X);
        Player player2 = new Player(2, Value.O);
        TicTacToe game = new TicTacToe(player1, player2);
        assertNotNull(game.getCurrentPlayer());
        assertNotNull(game.getPlayer());
        assertEquals(2, game.getPlayer().length);
    }

    @Test
    public void checkThatAPlayerWinsTheGameTest() {
        Player player1 = new Player(1, Value.X);
        Player player2 = new Player(2, Value.O);
        TicTacToe game = new TicTacToe(player1, player2);
        game.makeMove(0,0);
        game.makeMove(1,0);
        game.makeMove(0,1);
        game.makeMove(1,1);
        game.makeMove(0,2);
        assertTrue(game.checkWinner());
    }

    @Test
    public void checkThatThereIsADrawInTheGameTest() {
        Player player1 = new Player(1, Value.X);
        Player player2 = new Player(2, Value.O);
        TicTacToe game = new TicTacToe(player1, player2);

        game.makeMove(0, 0);
        game.makeMove(0, 1);
        game.makeMove(0, 2);
        assertFalse(game.isGameBoardFull());
        game.makeMove(1, 0);
        game.makeMove(1, 1);
        assertFalse(game.isGameBoardFull());
        game.makeMove(1, 2);
        game.makeMove(2, 0);
        game.makeMove(2, 2);
        assertFalse(game.isGameBoardFull());
        game.makeMove(2, 1);
        assertTrue(game.isGameBoardFull());
    }

}
