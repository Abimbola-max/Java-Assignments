import java.util.Scanner;

public class ElementExistence {

	public static void main(String... args) {

		Scanner input = new Scanner(System.in);
			
		System.out.print("Enter the number of values you want to input: ");
		int numberOfElement = input.nextInt();
	
		int[] arrNumber = new int[numberOfElement];


		System.out.println("Good! " + "Input " + numberOfElement + " " +  "numbers now" );

		for (int count = 0; count < numberOfElement; count++) {
			arrNumber[count] = input.nextInt(); 
		}
		
		System.out.print("Enter the element you would like to search for: ");
		int searchElement = input.nextInt();

		boolean iFoundIt = false;

		for (int count = 0; count < numberOfElement; count++) {
            		if (arrNumber[count] == searchElement) {
                		iFoundIt = true;
			}
		}

		if (iFoundIt == true) {
			System.out.println(searchElement + " " + "exists in the array");
		} else {
			System.out.println(searchElement + " " + " does not exists in the array");
		}
	}
}		









