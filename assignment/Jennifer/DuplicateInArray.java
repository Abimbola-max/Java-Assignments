import java.util.Scanner;

public class DuplicateInArray {

	public static void main(String [] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of values you want to input: ");
		int numberOfElement = input.nextInt();
		
		int[] numbers = new int[numberOfElement];

		System.out.println("Enter the values for the element you chose: ");
		
		for (int count = 0; count < numberOfElement; count++) {
			numbers[count] = input.nextInt();
		} 
	
		System.out.print("The duplicate number in the array is: ");
		for (int count = 0; count < numberOfElement; count++) {
			for (int counter = count + 1; counter < numberOfElement; counter++) {
				if (numbers[count] == numbers[counter]) {
					System.out.print(numbers[count] + " ");
					break;
				}
			}
		}
	}
		
}