import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {

	 Scanner input = new Scanner(System.in);

	 System.out.print("Enter a number: ");
	 int number1 = input.nextInt(); 
	
	for (int number = 1; number < number1; number++) {
	System.out.println();

		for(int count = 1 ; count <= number; count++) {
		System.out.print(count + " ");
		}  
	}     

		for(int counter = number1; counter >=1; counter--) {
		System.out.println();

			for(int numbers = 1; numbers <= counter; numbers++) {
			System.out.print(numbers + " ");
	
			}
		}
}
	}