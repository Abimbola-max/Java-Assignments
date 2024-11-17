import java.util.Arrays;

import java.util.Scanner;

	public class MergeTwoSortedArray {

		public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
	
			System.out.println("Enter the first number of values you want to input: ");
			int firstNumberOfElement = input.nextInt();
			
			int[] number1 = new int[firstNumberOfElement];

			System.out.println("Enter the first list of numbers: ");

			for (int count = 0; count < firstNumberOfElement; count++) {
				number1[count] = input.nextInt();
			}
			
			System.out.print("Enter the second number of values you want to input: ");
			int secondNumberOfElement = input.nextInt();
			
			int[] number2 = new int[secondNumberOfElement];

			System.out.print("Enter the second list of numbers: ");

			for (int count = 0; count < secondNumberOfElement; count++) {
				number2[count] = input.nextInt();
			}

			int[] mergedList = merge(number1, number2);
			
			System.out.println("Merged List is: " + Arrays.toString(mergedList));

	}
}

	




	
			
	


