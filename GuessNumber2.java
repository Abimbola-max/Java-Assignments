import java.util.Scanner;

public class GuessNumber2 {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a guess from 0-50");
	int guess = input.nextInt();

	int number = (int)(Math.random() * 51);

	while (guess != number) {

		if (guess > number) {
	      System.out.println("Too high" + ", here is the guessed number: " + number); 
	    } else {
	      System.out.println("Too low" + ", here is the guessed number: " + number);
              }

		System.out.print("Enter another guess: ");
		guess = input.nextInt();
	     if (guess == number) {
	       System.out.println("Your guess is correct" + ", here is the guessed number" + number );

	}

}
  }


	

	