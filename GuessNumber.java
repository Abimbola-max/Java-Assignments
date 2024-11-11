import java.util.Scanner;

public class GuessNumber {
	
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	int guessNumber = 40;

	System.out.print("Enter number from (1-100): ");
	int number = input.nextInt();

	 if (number == guessNumber) {
	  System.out.print("correct");
	} else if (number > guessNumber) {
	  System.out.print("Too high, try again");
	} else {
	  System.out.print("Too low, try again");
	}
    }
}