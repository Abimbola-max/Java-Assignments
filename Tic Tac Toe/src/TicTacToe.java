public class TicTacToe {

    private final Value[][] scoreBoard;
    private final Player[] players;
    private final Player currentPlayer;

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
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(scoreBoard[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public Player[] getPlayer() {
        return players;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

//    public boolean checkWinner() {
//        Value check = currentPlayer.getValue();
//
//        for
//
//    }
}





















