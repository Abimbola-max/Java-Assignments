import java.util.Scanner;

public class SwappingOfNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter first number: ");
			int number_one = input.nextInt();

		System.out.println("Enter second number: ");
			int number_two = input.nextInt();

		int temp = number_one;
		number_one = number_two;
		number_two = temp;
		
		System.out.print(number_one + " " + number_two);

	}
}