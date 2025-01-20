import java.util.Scanner;

public class ReverseArray {

	public static void main(String... args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first number of values you want to input: ");
		int numberOfElement = input.nextInt();
		
		int[] number = new int[numberOfElement];

		System.out.println("Enter the values for the element you chose: ");
		
		for (int count = 0; count < numberOfElement; count++) {
			number[count] = input.nextInt();
		}		

			System.out.print("\nThe reverse number is: ");
			for (int counter = numberOfElement - 1; counter >= 0; counter--) {
				System.out.print(number[counter] + " ");

			}


		

	}

}