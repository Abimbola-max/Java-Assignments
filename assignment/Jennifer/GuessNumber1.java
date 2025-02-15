import java.util.Scanner;

public class GuessNumber1 {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	int number;
	int guessNumber = 30;

	do {
	   System.out.print("Enter a number: ");
	    number = input.nextInt();

	 if (number > guessNumber) {
	  System.out.println("Too high, try again");
	} else if (number < guessNumber) {
	  System.out.println("Too low, try again");
	}
	
	} while (number != guessNumber);
	  System.out.println("you are correct");
}
  }




