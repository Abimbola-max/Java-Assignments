import java.util.Scanner;

	public class Exponent {

	     public static void main(String [] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter first number: "); 
		int number1 = input.nextInt();

		System.out.print("Enter second number: ");
		int number2 = input.nextInt();

		int product = 1;
		
		for (int count = 1; count <= number2; count++){
			product = product * number1;
		}

		System.out.print("The exponent of the first number to the second  is " + product);
		


	}	
}	


// 2 * 2 * 2 = 8
/**

product = 1 * 2
product = 2
product = 2 * 2
product = 4
product = 4 * 2
product = 8


*/