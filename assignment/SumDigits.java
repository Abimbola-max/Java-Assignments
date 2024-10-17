import java.util.Scanner; // import scanner from java utilities

		public class SumDigits {  /** class declaration */


		public static void main(String[] args) { // main method begins execution

		Scanner assignment = new Scanner(System.in);  /* instantiating a new object of class scanner
		
		System.out.print("Enter number from 0-1000: "); // prompt the user to enter a number 0-1000
		int numberl = assignment.nextInt();// collect the number and save as number1

		int firstNumber = number1/100; /** compute to get the first number */

		int secondNumber = (number1 / 10) % 10; /** compute to get the second number */


		int thirdNumber - number1 % 10;  /** compute to get the third number */


		int sumofDigits = firstNumber + secondNumber + thirdNumber; //add up all the numbers

		System.out.print (sumofDigits); /** print the sum of the digits */

	} // 
} // 