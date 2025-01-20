import java.util.Scanner;

public class ExtractSum {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

		int total = 0;

		System.out.print("Enter number: ");
		int number = input.nextInt();

		while (number > 0) {

			int lastDigit =  number % 10;
			 total += lastDigit;

			number /= 10;
		}

		System.out.printf("The sum of numbers is %d%n", total);
     
}
	}

	

		


