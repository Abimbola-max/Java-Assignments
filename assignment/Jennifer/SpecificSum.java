import java.util.Scanner;

public class SpecificSum {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter first number: ");
	int number = input.nextInt();
	
	int sum = 0;
	int number1 = 0;
		
	while (sum < number) {
		System.out.print("Enter sum numbers: ");
		number1 = input.nextInt();
		sum += number1;
	} number1++;

	System.out.println("The sum of the entered integers is: " + sum);
        System.out.print("The sum has reached or exceeded the first number input of " + number);
	
    }
	}

/**
prompt the user to enter a number
collect the number
store as 'number'
declare a variable sum
prompt the user to keep entering numbers 
collect the numbers 
store as number1
as the user is entering the number, add to sum
add till the number because the first number that was input by the user
*/


	

