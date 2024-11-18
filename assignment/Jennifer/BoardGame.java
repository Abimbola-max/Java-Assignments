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
			 		
		for (int count = 0; count < board.length; count++) {
			for(int counter = count; counter < board.length; counter++) {
	
		System.out.println("Player 1: Where would you like to play? pick from 1-9");
		String userInput = input.nextLine();

		switch (userInput) {
			case "1":
				board[0][0] = 'x';
				break;
			case "2":
				board[0][1] = 'x';
				break;
			case "3":
				board[0][2] = 'x';
				break;
			case "4":
				board[1][0] = 'x';
				break;
			case "5":
				board[1][1] = 'x';
				break;
			case "6":
				board[1][2] = 'x';
				break;
			case "7":
				board[2][0] = 'x';
				break;
			case "8":
				board[2][1] = 'x';
				break;
			case "9":
				board[2][2] = 'x';
				break;
			default:
				System.out.println("Enter the right thing");
			}
	

		System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println("-+-+-");	
		System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println("-+-+-");
		System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);

		
		System.out.println("Player 2: Where would you like to play? pick from 1-9");
		String userInput1 = input.nextLine();	

		switch (userInput1) {
			case "1":
				board[0][0] = 'o';
				break;
			case "2":
				board[0][1] = 'o';
				break;
			case "3":
				board[0][2] = 'o';
				break;
			case "4":
				board[1][0] = 'o';
				break;
			case "5":
				board[1][1] = 'o';
				break;
			case "6":
				board[1][2] = 'o';
				break;
			case "7":
				board[2][0] = 'o';
				break;
			case "8":
				board[2][1] = 'o';
				break;
			case "9":
				board[2][2] = 'o';
				break;

			default:
				System.out.println("Enter the right thing");
		}  
	
		System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println("-+-+-");	
		System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println("-+-+-");
		System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);

	
	}
}


	}
}