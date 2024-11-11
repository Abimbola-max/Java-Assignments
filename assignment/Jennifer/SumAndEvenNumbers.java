import java.util.Scanner;

public class SumAndEvenNumbers {

	public static void main(String... args) {

	Scanner input = new Scanner(System.in);

	int sum = 0;
		
	for(int counter = 0; counter < 2; counter++) {
		System.out.print("Enter number: ");
		int number = input.nextInt();
	
		for (int count = 2; count <= number; count++) {
			if (count % 2 == 0) {
				sum += count;
			}
		}
		
	}
	 		System.out.println("The sum of all even numbers are: " + sum);

    }
 }