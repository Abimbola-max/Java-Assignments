import java.util.Scanner;

public class MinimumElementInArray {

	public static void main(String... args) {

		Scanner input = new Scanner(System.in);
			
		System.out.print("Enter the number of values you want to input: ");
		int numberOfElement = input.nextInt();
	
		int[] arrNumber = new int[numberOfElement];


		System.out.println("Good! " + "Input " + numberOfElement + " " +  "numbers now" );

		for (int count = 0; count < numberOfElement; count++) {
			arrNumber[count] = input.nextInt(); 
		}

			int min = arrNumber[0];

		for (int count = 1; count < numberOfElement; count++) {
	
			if (arrNumber[count] < min) {
				min = arrNumber[count];
			}
		}
			System.out.printf("The min value is %d ", min);
	}
}