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

			System.out.println("Enter the second list of numbers: ");

			for (int count = 0; count < secondNumberOfElement; count++) {
        			number2[count] = input.nextInt();
    			}


    			int[] mergedArray = new int[firstNumberOfElement + secondNumberOfElement];
    			int firstListIndex = 0; 
    			int secondListIndex = 0; 
    			int mergedNumbers = 0; 

   		 	while (firstListIndex < firstNumberOfElement && secondListIndex < secondNumberOfElement) { 
        			if (number1[firstListIndex] < number2[secondListIndex]) {
            				mergedArray[mergedNumbers++] = number1[firstListIndex++];
        			} else {
           				 mergedArray[mergedNumbers++] = number2[secondListIndex++];
        			}
    			}

    
    			while (firstListIndex < firstNumberOfElement) {
        			mergedArray[mergedNumbers++] = number1[firstListIndex++];
    			}

    			while (secondListIndex < secondNumberOfElement) {
        			mergedArray[mergedNumbers++] = number2[secondListIndex++];
    			}
 
    			System.out.println("Merged Array: " + Arrays.toString(mergedArray));
	}

}
					


	


	
			
	


