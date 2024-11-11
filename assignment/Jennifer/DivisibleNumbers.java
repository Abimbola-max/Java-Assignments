import java.util.Scanner;

public class DivisibleNumbers {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter number: ");
	int number = input.nextInt();

	
	for(int count = 1; count < number; count++) {
		 if (count % 7 == 0 && count % 13 == 0) {
			System.out.print("There is a number is divisible by " + "7 " + "and " + "13");
		} else {
		System.out.print("This number is no number divisible by " + "7 " + "and " + "13");
	}	}
    }
}