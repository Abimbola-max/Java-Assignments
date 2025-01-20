import java.util.Scanner;

public class FloatingPointNumbers {

   public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter first floating number: ");
	float first_number = input.nextFloat();	

	System.out.print("Enter second floating number: ");
	float second_number = input.nextFloat();

	if (first_number == second_number) {
	   System.out.print("They are the same");
	} else {
	  System.out.print("They are different");
	  }
    }  
}