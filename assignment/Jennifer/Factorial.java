import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
		
	int factorial = 1;

	System.out.print("Enter number of terms: ");
	int terms = input.nextInt();

	for (int count = 1; count <= terms; count++) {
            factorial *= count;
        }
	  System.out.printf("The factorial of %d is %d%n", terms, factorial);
}
}
