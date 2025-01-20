import java.util.Scanner;

public class IntegerToString {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number you want to convert: ");
	int number = input.nextInt();

	String str = String.valueOf(number);
	
	System.out.print(str);

	}
}