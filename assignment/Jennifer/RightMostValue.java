import java.util.Scanner;

  public class RightMostValue {

    public static void main(String...args) {

	Scanner task = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int number1 = task.nextInt();

	System.out.print("Enter second number: ");
	int number2 = task.nextInt();

	System.out.print("Enter first number: ");
	int number3 = task.nextInt();

	int lastDigit1 = number1 % 10;
        int lastDigit2 = number2 % 10;
        int lastDigit3 = number3 % 10;
	
	if ( lastDigit1 == lastDigit2 || lastDigit1 == lastDigit3 || lastDigit2 == lastDigit3) {
		System.out.print("True");
	} else {
		System.out.print("false");
	  }
}
	}