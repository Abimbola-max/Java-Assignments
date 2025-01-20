import java.util.Scanner;

public class Equality1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

 	int response;

	do {

		System.out.print("Enter first number: ");
		int firstNumber = input.nextInt();

		System.out.print("Enter second number: ");
		int secondNumber = input.nextInt();

		System.out.print("Enter third number: ");
		int thirdNumber = input.nextInt();


		if (firstNumber == secondNumber && firstNumber == thirdNumber) {
	   	System.out.println("The numbers are equal");

		} else {
	  	 System.out.println("The numbers are not equal");
		}
			System.out.println("Do you want to continue ?"); 	  	        	  	   	System.out.println("press 0 to continue or press -1 to quit: ");
	  
	 response = input.nextInt();
	}
 	  while (response == 0);

}
   }

	
	
          