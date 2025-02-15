import java.util.Scanner;

public class NumberOfOccurrence {

	public static void main(String... args) {

		Scanner input = new Scanner(System.in);
			
		System.out.println("Enter the number of values you want to input: ");
		int numberOfElement = input.nextInt();
		
		int[] numbers = new int[numberOfElement];

		System.out.println("Good! " + "Input " + numberOfElement + " " +  "numbers now" );
		System.out.println("Enter integers: ");

		
		for (int count = 0; count < numberOfElement; count++) {
			numbers[count] = input.nextInt();			
		}

		System.out.print("Enter the element you would like to search for: ");
		int searchElement = input.nextInt();

		int occurrence = 0;

		for (int count = 0; count < numberOfElement; count++) {
			if (searchElement == numbers[count]) {
				occurrence +=1;	
			}
		}
			if (occurrence == 1) { 
				System.out.print(
searchElement + " occurred" + " " + occurrence + " " + "time");
			} else {
				System.out.print(searchElement + " occurred" + " " + occurrence + "times");
			}
		
	}
}
		






















