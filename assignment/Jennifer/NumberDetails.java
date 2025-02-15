import java.util.Scanner;

public class NumberDetails {

	public static void main(String[] args) {
	
	Scanner assignment = new Scanner(System.in);

	System.out.print("Enter first integer: ");
	int number1 = assignment.nextInt(); 

	System.out.print("Enter second integer: ");
	int number2 = assignment.nextInt(); 

	int squareoffirstnumber = number1 * number1;
	System.out.println("the square of the first number is " + squareoffirstnumber);
	
	
	
	int squareofsecondnumber = number2 * number2;
	System.out.println("the square of the second number is " + squareofsecondnumber);

		int sum = squareoffirstnumber + squareofsecondnumber;
	System.out.println("sum of the squares is " + sum);

	int difference =  squareoffirstnumber - squareofsecondnumber;
	System.out.println("difference of the squares is " + difference);

	}
}



	
