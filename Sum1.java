import java.util.Scanner;

public class Sum1 {

   public static void main(String[] args) {

	Scanner task = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int number1 = task.nextInt();

	System.out.print("Enter second number: ");
	double number2 = task.nextDouble();
	
	System.out.print("Enter third number: ");
	float number3 = task.nextFloat();

	double sum = number1 + number2 + number3;

	System.out.printf("The sum of the numbers is %.2f: ", sum);

	}
}


