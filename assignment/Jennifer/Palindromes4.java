import java.util.Scanner;

public class Palindromes4 {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter number: ");
	int number = input.nextInt();

	int firstDigit = number / 10000;
	int lastDigit = number % 10;

	if (number < 10000 && number > 99999) {
		System.out.print("Error, please input a five digit number.");
	} else if (firstDigit == lastDigit) {
		System.out.print("It is a palindrome.");
	} else {
		System.out.print("It is not a palindrome.");
   	}
}
     }