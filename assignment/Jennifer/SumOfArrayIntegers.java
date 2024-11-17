import java.util.Scanner;

public class SumOfArrayIntegers {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	
		System.out.print("How many numbers do you wish to enter? ");
		int number = input.nextInt();

		int[] arrNumber = new int[number];

		System.out.println("Good! " + "Input " + number + " " +  "numbers now" );

		int sum = 0;

		for (int count = 0; count < number; count++) {
			arrNumber[count] = input.nextInt();			
			
		}
			
		for (int count = 0; count < number; count++) {
			sum += arrNumber[count];
			
		}	
			System.out.printf("The sum of all elements in the array is %d: ", sum);

	}
}