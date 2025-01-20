import java.util.Scanner;

public class QuadraticEquation {

   public static void main(String... args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter the value for a: ");
	int a = input.nextInt();

	System.out.print("Enter the value for b: ");
	int b = input.nextInt();

	System.out.print("Enter the value for c: ");
	int c = input.nextInt();
  
	double discriminant = b*b - 4*a*c;

	System.out.println("The discriminant is " + discriminant);
	
	if (discriminant > 0) {
	  double result1 = (-b + (Math.sqrt(discriminant))) / 2 * a;
	  double result2 = (-b - (Math.sqrt(discriminant))) / 2 * a;

	   System.out.println("Result one is: " + result1);
	   System.out.println("Result two is: " + result2);
	}
	else if (discriminant == 0) {
	    double result3 = -b / (2 * a);
		System.out.println("The result is: " + result3);
	}

	else {
	     double result4 = -b / 2* a + (Math.sqrt(discriminant)) / 2 * a;
	      double result = -b / 2* a + (Math.sqrt(discriminant)) / 2 * a;
		System.out.println("NaN");
	}
		

	}
}