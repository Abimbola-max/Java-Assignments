import java.util.Scanner;

public class NumberCheck {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

 	int response;

	do {

	System.out.print("Enter a number: ");
	int number = input.nextInt();

	  if (number > 0) {
	   System.out.println(number + " is a positive number.");
	  } else if (number < 0) {
            System.out.println(number + " is a negative number.");
          } else {
            System.out.println("The number is zero.");
          } 
	  System.out.println("Do you want to continue"); 	  	        	  System.out.print("press 0 to continue or press -1 to quit: ");
	  
	  response = input.nextInt();
	}
 	  while (response == 0);
}
   }

	
	
          