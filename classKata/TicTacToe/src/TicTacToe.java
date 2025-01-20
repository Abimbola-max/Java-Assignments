public class TicTacToe {

    public enum Value {
        X, O, EMPTY
    }

    private Value[][] board;

    public TicTacToe() {
        board = new Value[1][1];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = Value.EMPTY;
            }
        }
    }


    public void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void makeMove(int row, int col, Value value) {
        if (board[row][col] == Value.EMPTY) {
            board[row][col] = value;
        } else {
            System.out.println("Invalid move. Cell already occupied.");
        }
    }

    public boolean isWon() {

        for (int i = 0; i < 3; i++) {
            if (board[i][1] != Value.EMPTY && board[i][1] == board[i][2] && board[i][2] == board[i][3]) {
                return true;
            }
        }

        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[1][j] != Value.EMPTY && board[1][j] == board[2][j] && board[2][j] == board[3][j]) {
                return true;
            }
        }


        if (board[1][1] != Value.EMPTY && board[1][1] == board[2][2] && board[2][2] == board[3][3]) {
            return true;
        }
        if (board[3][1] != Value.EMPTY && board[3][1] == board[2][2] && board[2][2] == board[3][3]) {
            return true;
        }

        return false;
    }

    public boolean isDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == Value.EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.displayBoard();


        int currentPlayer = 1;
        while (!game.isWon() && !game.isDraw()) {
            System.out.println("Player " + currentPlayer + "'s turn.");

            java.util.Scanner input = new java.util.Scanner(System.in);
            System.out.print("Enter row (0-2): ");
            int row = input.nextInt();
            System.out.print("Enter column (0-2): ");
            int col = input.nextInt();

            Value value = (currentPlayer == 1) ? Value.X : Value.O;
            game.makeMove(row, col, value);

            game.displayBoard();


            if (game.isWon()) {
                System.out.println("Player " + currentPlayer + " wins!");
            } else if (game.isDraw()) {
                System.out.println("It's a draw!");
            }


            currentPlayer = (currentPlayer == 1) ? 2 : 1;
        }
    }
}