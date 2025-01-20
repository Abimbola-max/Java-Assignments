import java.util.Scanner;

  public class GreatestNumber {

    public static void main(String...args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int numberOne = input.nextInt();

	System.out.print("Enter second number: ");
	int numberTwo = input.nextInt();

	System.out.print("Enter third number: ");
	int numberThree = input.nextInt();


	if (numberOne  >  numberTwo && numberOne > numberThree) {
	System.out.print("the greatest is " + numberOne);
	}
	if (numberTwo >  numberOne && numberTwo > numberThree) {
	System.out.print("the greatest is " + numberTwo);
	}
	if (numberThree >  numberOne && numberThree > numberTwo) {
	System.out.print("the greatest is " + numberThree);
	}
}
	}

	


