import java.util.Scanner;

public class TicTacToe {

    static Scanner input = new Scanner(System.in);
    static char[][] board = {  
        {' ', ' ', ' '}, 
        {' ', ' ', ' '}, 
        {' ', ' ', ' '}
    };

    public static void main(String[] args) {
	
        overallGameEffect();
    }
	

   public static void printBoard() {
   
	for( int rowLoop = 0; rowLoop < 3; rowLoop++) {
		for( int columnLoop = 0; columnLoop < 3; columnLoop++) {
			System.out.print(board[rowLoop][columnLoop]);

			if (columnLoop < 2) {
				System.out.print("|");
			}
		}
			System.out.println();

			if (rowLoop < 2) {
				System.out.println("-+-+-");
			}
	}

    }

    public static void playerMoves() {
        int currentPlayer = 1;

	try {
	
        for (int turn = 0; turn < 9; turn++) {
            System.out.println("Player " + currentPlayer + ", please enter your move (1-9): ");
            int move = input.nextInt();

            
            int row = (move - 1) / 3;
            int col = (move - 1) % 3;

            
            if (move < 1 || move > 9 || board[row][col] != ' ') {
                System.out.println("Invalid move! Try again.");
                turn--; 
                continue; 
            }

            board[row][col] = (currentPlayer == 1) ? 'X' : 'O';
            printBoard(); 

            if (checkWin(currentPlayer)) {
                System.out.println("Congratulations! Player " + currentPlayer + " wins!");
                return; 
            }

           
            currentPlayer = (currentPlayer == 1) ? 2 : 1; 
        }
      
	
        System.out.println("It's a draw!");

	} catch(Exception InputMismatchException) {
		System.out.println("Please input either x or o");
	    }
	
}

    public static boolean checkWin(int player) {
        char symbol = (player == 1) ? 'X' : 'O';

        
        for (int count = 0; count < 3; count++) {
            if (board[count][0] == symbol && board[count][1] == symbol && board[count][2] == symbol) {
                return true;
            }
        }

        
        for (int counter = 0; counter < 3; counter++) {
            if (board[0][counter] == symbol && board[1][counter] == symbol && board[2][counter] == symbol) {
                return true;
            }
        }


        if ((board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
            (board[0][2] == symbol && board[1][1] == symbol && board[0][2] == symbol)) {
            return true;
        }

        return false;
    }

    public static void overallGameEffect() {
        
        System.out.println("Welcome to Bibi's Tic Tac Toe Game!");
        printBoard();
        playerMoves();
    }
}