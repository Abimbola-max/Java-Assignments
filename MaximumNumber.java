import java.util.Scanner;

public class MaximumNumber {

   public static void main(String... args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int firstNumber = input.nextInt();

	System.out.print("Enter second number: ");
	int secondNumber = input.nextInt();

	System.out.print("Enter third number: ");
	int thirdNumber = input.nextInt();

	if (firstNumber > secondNumber &&  firstNumber > thirdNumber) {
	System.out.print("The maximum number is " + firstNumber);
	} else if (secondNumber > firstNumber &&  secondNumber > thirdNumber) {
	System.out.print("The maximum number is " + secondNumber);
	} else 
	System.out.print("The maximum number is " + thirdNumber);
	
	}
}