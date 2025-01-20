import java.util.Scanner;

public class BoardGame {

	public static void main(String... args) {

		char[][] board = {{' ', ' ', ' '}, 
						 {' ', ' ', ' '}, 
						 {' ', ' ', ' '}};

		System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println("-+-+-");
		System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println("-+-+-");
		System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);

		Scanner input = new Scanner(System.in);

				
		for (int turn = 1; turn <= 9; turn++) {
			
			
			if (turn % 2 != 0) {
				System.out.println("Player 1: Where would you like to play? Pick from 1-9");
				String userInput = input.nextLine();

				switch (userInput) {
					case "1":
						if (board[0][0] == ' ') { 
							board[0][0] = 'x';
						} else {
							System.out.println("That spot is taken. Try again.");
							turn--; 
						}
						break;
					case "2":
						if (board[0][1] == ' ') {
							board[0][1] = 'x';
						} else {
							System.out.println("That spot is taken. Try again.");
							turn--;
						}
						break;
					case "3":
						if (board[0][2] == ' ') {
							board[0][2] = 'x';
						} else {
							System.out.println("That spot is taken. Try again.");
							turn--;
						}
						break;
					case "4":
						if (board[1][0] == ' ') {
							board[1][0] = 'x';
						} else {
							System.out.println("That spot is taken. Try again.");
							turn--;
						}
						break;
					case "5":
						if (board[1][1] == ' ') {
							board[1][1] = 'x';
						} else {
							System.out.println("That spot is taken. Try again.");
							turn--;
						}
						break;
					case "6":
						if (board[1][2] == ' ') {
							board[1][2] = 'x';
						} else {
							System.out.println("That spot is taken. Try again.");
							turn--;
						}
						break;
					case "7":
						if (board[2][0] == ' ') {
							board[2][0] = 'x';
						} else {
							System.out.println("That spot is taken. Try again.");
							turn--;
						}
						break;
					case "8":
						if (board[2][1] == ' ') {
							board[2][1] = 'x';
						} else {
							System.out.println("That spot is taken. Try again.");
							turn--;
						}
						break;
					case "9":
						if (board[2][2] == ' ') {
							board[2][2] = 'x';
						} else {
							System.out.println("That spot is taken. Try again.");
							turn--;
						}
						break;
					default:
						System.out.println("Invalid input. Please enter a number from 1 to 9.");
						turn--; 
				}
			} 
			
			else {
				System.out.println("Player 2: Where would you like to play? Pick from 1-9");
				String userInput = input.nextLine();

				switch (userInput) {
					case "1":
						if (board[0][0] == ' ') {
							board[0][0] = 'o';
						} else {
							System.out.println("That spot is taken. Try again.");
							turn--;
						}
						break;
					case "2":
						if (board[0][1] == ' ') {
							board[0][1] = 'o';
						} else {
							System.out.println("That spot is taken. Try again.");
							turn--;
						}
						break;
					case "3":
						if (board[0][2] == ' ') {
							board[0][2] = 'o';
						} else {
							System.out.println("That spot is taken. Try again.");
							turn--;
						}
						break;
					case "4":
						if (board[1][0] == ' ') {
							board[1][0] = 'o';
						} else {
							System.out.println("That spot is taken. Try again.");
							turn--;
						}
						break;
					case "5":
						if (board[1][1] == ' ') {
							board[1][1] = 'o';
						} else {
							System.out.println("That spot is taken. Try again.");
							turn--;
						}
						break;
					case "6":
						if (board[1][2] == ' ') {
							board[1][2] = 'o';
						} else {
							System.out.println("That spot is taken. Try again.");
							turn--;
						}
						break;
					case "7":
						if (board[2][0] == ' ') {
							board[2][0] = 'o';
						} else {
							System.out.println("That spot is taken. Try again.");
							turn--;
						}
						break;
					case "8":
						if (board[2][1] == ' ') {
							board[2][1] = 'o';
						} else {
							System.out.println("That spot is taken. Try again.");
							turn--;
						}
						break;
					case "9":
						if (board[2][2] == ' ') {
							board[2][2] = 'o';
						} else {
							System.out.println("That spot is taken. Try again.");
							turn--;
						}
						break;
					default:
						System.out.println("Invalid input. Please enter a number from 1 to 9.");
						turn--; 
				}
			}

			
			System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
			System.out.println("-+-+-");
			System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
			System.out.println("-+-+-");
			System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);

			
			char winMarker = ' '; 

for (int i = 0; i < 3; i++) {
    if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
        winMarker = board[i][0];
        break; 
    }
}


if (winMarker == ' ') { 
    for (int j = 0; j < 3; j++) {
        if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != ' ') {
            winMarker = board[0][j];
            break; 
        }
    }
}


if (winMarker == ' ') { 
    if ((board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') ||
        (board[2][0] == board[1][1] && board[1][1] == board[2][0] && board[2][0] != ' ')) {
        winMarker = board[1][1];
    }
}


if (winMarker != ' ') {
    System.out.println("Player " + winMarker + " won!");
    break; 
} else if (turn == 9) {
    System.out.println("It's a draw!");
	}
}
	}
}