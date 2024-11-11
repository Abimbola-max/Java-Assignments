import java.util.Scanner;

public class EligibilityCheck {

	public static void main(String... args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter your age: ");
		int age = input.nextInt();

		if (age >= 16) {
		System.out.print("You can drive.");
		} else if (age >= 18) { 
		System.out.print("You can vote.");
		} else  {
		 System.out.print("You can drink.");
		
		}
} 	
	}
