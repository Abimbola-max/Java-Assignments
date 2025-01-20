import java.util.Scanner;

public class PoundsToKilogramConverter {

	public static void main(String[] args) {

		Scanner converter = new Scanner(System.in);

		System.out.print("Enter the number in pounds:");
		double pounds = converter.nextDouble();

		double kilogram = pounds * 0.454;

		System.out.printf("%.2f kilogram is equal to %.2f kilogram.%n", pounds,kilogram);
	
	}
}