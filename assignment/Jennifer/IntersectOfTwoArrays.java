import java.util.Scanner;

public class IntersectOfTwoArrays {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);	
		
		System.out.print("Enter the first number of values you want to input: ");
		int firstNumberOfElement = input.nextInt();
		
		int[] firstNumber = new int[firstNumberOfElement];

		System.out.println("Enter the values for the first element you chose: ");
		
		for (int count = 0; count < firstNumberOfElement; count++) {
			firstNumber[count] = input.nextInt();
		}		

		System.out.print("Enter the second number of values you want to input: ");
		int secondNumberOfElement = input.nextInt();
		
		int[] secondNumber = new int[secondNumberOfElement];

		System.out.println("Enter the values for the first element you chose: " );
		
		for (int counter = 0; counter < secondNumberOfElement; counter++) {
			secondNumber[counter] = input.nextInt();
		}		

		for (int counter = 0; counter < firstNumberOfElement; counter++) {
			for (int count = 0; count < secondNumberOfElement; count++) {
				if (firstNumber[count] == secondNumber[counter]) {
					System.out.print(firstNumber[count] + " ");
					break;
					
				}
			}
		}	

	
	}
}