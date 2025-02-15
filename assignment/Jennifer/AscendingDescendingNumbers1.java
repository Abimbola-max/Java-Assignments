import java.util.Scanner;

public class AscendingDescendingNumbers1 {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	int response;

	do {
	
		System.out.print("Enter first number: ");
		int numberOne = input.nextInt();

		System.out.print("Enter second number: ");
		int numberTwo = input.nextInt();

		System.out.print("Enter third number: ");
		int numberThree = input.nextInt();
	
		if(numberOne < numberTwo && numberOne < numberThree) {
		   System.out.println("This is in ascending order");
		} else {
		   System.out.println("This is in descending order");
	  	}

	System.out.println("Do you wish to continue?");
	System.out.println("Press 0 to continue and -1 to quit");
	
	response = input.nextInt();
	}
		while (response == 0);
	
  }
}
