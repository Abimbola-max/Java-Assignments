import java.util.Scanner;

public class MaximumNumbersOfFourNumbers {

	public static void main(String... args) {

		Scanner input = new Scanner(System.in);

		int maximum = 0;
		
		for(int count = 0; count < 4; count++) {
			System.out.println("Enter numbers: ");
			int numbers = input.nextInt();
		
			if (numbers > maximum && maximum < numbers) {
				maximum = numbers;
				numbers = maximum;
			} 
		}System.out.print("The maximum number from the four numbers given is: " + maximum);		


	}
	
}