public class TicTacToe {

    private final Value[][] scoreBoard;
    private Player[] players;
    private Player currentPlayer;

    public TicTacToe(Player player1, Player player2) {
        scoreBoard = new Value[][]{
                {Value.EMPTY, Value.EMPTY, Value.EMPTY},
                {Value.EMPTY, Value.EMPTY, Value.EMPTY},
                {Value.EMPTY, Value.EMPTY, Value.EMPTY}
        };
        this.players = new Player[]{player1, player2};
        currentPlayer = player1;
    }

    public void printBoard() {
        for (int row = 0; row < 3; row++) {
            System.out.print("| ");
            for (int column = 0; column < 3; column++) {
                System.out.print(scoreBoard[row][column] + " | ");
            }
            System.out.println();
            System.out.println("----------------------------");
        }
    }

    public Player[] getPlayer() {
        return players;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public boolean checkWinner() {

        Value check = currentPlayer.getValue();

        for (int count = 0; count < 3; count++) {
            if (scoreBoard[count][0] == check && scoreBoard[count][1] == check && scoreBoard[count][2] == check) return true;
            if (scoreBoard[0][count] == check && scoreBoard[1][count] == check && scoreBoard[2][count] == check) return true;
        }

        if (scoreBoard[0][0] == check && scoreBoard[1][1] == check && scoreBoard[2][2] == check) return true;
        if (scoreBoard[0][2] == check && scoreBoard[1][1] == check && scoreBoard[2][0] == check) return true;

        return false;
    }

    public void makeMove(int row, int column) {
        if (row >= 0 && row < 3 && column >= 0 && column < 3 && scoreBoard[row][column] == Value.EMPTY) {
            scoreBoard[row][column] = currentPlayer.getValue();
            printBoard();
            if (checkWinner()){
                System.out.println("Player " + currentPlayer.getId() + " won!");
            } else if (isGameBoardFull()) {
                System.out.println("It's a tie!");
            } else {
                switchThePlayers();
            }
        } else {
            System.out.println("Don't waste my time!");
        }
    }

    private void switchThePlayers() {
        currentPlayer = (currentPlayer == players[0]) ? players[1] : players[0];
    }

    public boolean isGameBoardFull() {
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                if (scoreBoard[row][column] == Value.EMPTY) return false;
            }
        }
        return true;
    }
}






















