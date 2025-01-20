import java.util.Scanner;

	public class Palindrome {
	
		public static void main(String[] args) {

		Scanner assignment = new Scanner(System.in);

		System.out.print("Enter a 3digit number: ");
		int number = assignment.nextInt();

		int numberP = number/100;
		int numberQ = number%10;

		if (numberP == numberQ){
		System.out.print("It is a palindrome");
		}
		else{
		System.out.print("It is not a palindrome");
	}

	}
}