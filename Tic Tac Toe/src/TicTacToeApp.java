import Exceptions.InvalidRowOrColumnException;

import java.util.Scanner;

public class TicTacToeApp {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Player player1 = new Player(1, Value.X);
        Player player2 = new Player(2, Value.O);

        TicTacToe game = new TicTacToe(player1, player2);
        game.printBoard();

        while (!game.checkWinner() && !game.isGameBoardFull()) {
            try {
                System.out.println("Player " + game.getCurrentPlayer().getId() + ", enter your move");
                System.out.print("Row (0-2): ");
                int row = input.nextInt();
                System.out.print("Column (0-2): ");
                int column = input.nextInt();

                game.makeMove(row, column);

                if (game.checkWinner() || game.isGameBoardFull()) {
                    break;
                }
            } catch (InvalidRowOrColumnException e) {
                System.out.println("Enter integers only");
                input.next();
            }
        }
    }
}