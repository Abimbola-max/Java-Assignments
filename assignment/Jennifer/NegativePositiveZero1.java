import java.util.Scanner;

public class NegativePositiveZero1 {

   public static void main(String[] args) {

	Scanner assignment = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int firstNumber = assignment.nextInt();

	System.out.print("Enter second number: ");
	int secondNumber = assignment.nextInt();

	System.out.print("Enter third number: ");
	int thirdNumber = assignment.nextInt();

	if (firstNumber > 0) {
	 System.out.println(firstNumber + " is positive");
	} else if (firstNumber == 0) {
	    System.out.println(firstNumber + " is zero");
	} else {
	   System.out.println(firstNumber + " is negative");
	  }

	if (secondNumber > 0) {
	 System.out.println(secondNumber + " is positive");
	} else if (secondNumber == 0) {
	    System.out.println(secondNumber + " is zero");
	} else {
	   System.out.println(secondNumber + " is negative");
	  }

 	if (thirdNumber > 0) {
	 System.out.println(thirdNumber + " is positive");
	} else if (thirdNumber == 0) {
	    System.out.println(thirdNumber + " is zero");
	} else {
	   System.out.print(thirdNumber + " is negative");
	  }
			
    }
}