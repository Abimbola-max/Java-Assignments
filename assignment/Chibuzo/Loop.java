import java.util.Scanner;

public class Loop {

   public static void main(String[] args) {

	Scanner assignment = new Scanner(System.in);

	int response;

	do {
	System.out.print("Enter first number: ");
	int firstNumber = assignment.nextInt();

	System.out.print("Enter second number: ");
	int secondNumber = assignment.nextInt();

	int sum = firstNumber + secondNumber;

	System.out.println("The sum is: " + sum);

	System.out.println("Do you want to continue?");
	System.out.println("Press 0 to continue and -1 to quit");
	
	response = assignment.nextInt();

	} 
		while(response == 0);
		
    }
}