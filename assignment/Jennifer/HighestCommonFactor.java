import java.util.Scanner;

public class HighestCommonFactor {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int firstNumber = input.nextInt();

	System.out.print("Enter second number: ");
	int secondNumber = input.nextInt();
	
	int count = 1;
	int counter = 1;
	int factor = 1;
	int hcf = 0;

	if (firstNumber > secondNumber) {
		count = firstNumber ;
	} else {
		count = secondNumber ;
	}
	for (factor = 1; factor <= count; count++) {
		for (factor = 1; factor <= count; count++) {
			if (firstNumber % factor == 0 && secondNumber % factor == 0) {
				hcf = factor;
			
			}
		
		}
	}
		System.out.print("The HCF is" + " " + hcf);	
   }
}			

		
