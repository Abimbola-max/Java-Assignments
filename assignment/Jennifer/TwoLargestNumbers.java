import java.util.Scanner;

public class TwoLargestNumbers {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	int largest = 0;
	int number;

	int secondLargest = 0;

	for (int counter = 0; counter < 11; counter++) {

		System.out.print("Enter number: ");

		number = input.nextInt();

			if (number > largest) {
		   	 largest = number;

			} else if (largest > secondLargest) {
			 secondLargest = number;
			}
	}
		System.out.println("The largest number is: " + largest);
		System.out.println("The second largest number is: " + secondLargest);	

  }
}