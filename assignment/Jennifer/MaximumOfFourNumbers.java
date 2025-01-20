import java.util.Scanner;

public class MaximumOfFourNumbers {

	public static void main(String... args) {

		Scanner input = new Scanner(System.in);

		int maximum = 0;

		System.out.println("Enter first number: ");
			int number_one = input.nextInt();

		System.out.println("Enter second number: ");
			int number_two = input.nextInt();

		System.out.println("Enter third number: ");
			int number_three = input.nextInt();

		System.out.println("Enter fourth number: ");
			int number_four = input.nextInt();

		if (number_one > number_two && number_one > number_three && number_one > number_four) {
			maximum = number_one;
			number_one = maximum;
			
			System.out.print("The maximum number is: " + number_one);

		}

		  if (number_two> number_one  && number_two > number_three && number_two > number_four) {
			maximum = number_two;
			number_two = maximum;
			
			System.out.print("The maximum number is: " + number_two);
		}

		  if (number_three > number_one  && number_three > number_two && number_three > number_four) {
			maximum = number_three;
			number_three = maximum;
			

			System.out.print("The maximum number is: " + number_three);
		}

		 if (number_four > number_one  && number_four > number_two && number_four > number_three) {
			maximum = number_four;
			number_four = maximum;
			
			System.out.print("The maximum number is: " + number_four);
		}
			
	}
}
