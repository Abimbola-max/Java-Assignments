import java.util.Scanner;

  public class PositiveNegativeNumbers {

    public static void main(String...args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number = input.nextInt();

	if (number > 0) {
	System.out.print("number is positive");
	} else {
	System.out.print("number is not positive");
	}
	
}
	}
	
